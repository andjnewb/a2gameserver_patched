package ags.script.commands;

import ags.script.AbstractCommand;
import ags.script.Engine;
import ags.script.InitalizationException;
import ags.script.Target;
import ags.script.exception.FatalScriptException;

/**
 * Require Command:<br>
 * Executes specified target but only if it hasn't executed already
 * <br><br>
 * Arguments:<br>
 * target name
 * @author brobert, vps
 */
public class Require extends AbstractCommand {
    /**
     * name of target to call
     */
    private String targetName;
    
    /**
     * Ensures target name was passed in (not validated because target might not be parsed yet)
     * 
     * @param args target name
     * @throws com.vignette.vps.install.InitalizationException If the wrong number of arguments was provided
     */
    protected void init(String[] args) throws InitalizationException {
        if (args.length != 2)
            throw new InitalizationException("Require called with wrong number of arguments!");
        targetName = args[1];
    }

    /**
     * Does nothing
     */
    public void checkPaths() {}

    /**
     * Call required target if necessary
     * 
     * @throws com.vignette.vps.install.FatalScriptException If there was an error generated by the target
     */
    protected void doExecute() throws FatalScriptException {
        Target t = Target.getTarget(targetName);
        if (t == null) {
            Engine.getOut().println("Error in line "+getLineNumber()+", target '"+targetName+"' not found: ");
            throw new FatalScriptException("Target not found: "+targetName, null);
        }
        try {
            t.require();
        } catch (FatalScriptException ex) {
            throw ex;
        } catch (Throwable ex) {
            throw new FatalScriptException("Unhandled error when executing target "+t.getName(), ex);
        }
    }
}