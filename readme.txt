Note: This program has a dependancy on the "rxtx" library, found at rxtx.org.
Please visit that site for libraries relevant to your system if you're not using a windows machine.  The windows versions are shipped with this package.  You can also look at the ADT Pro disk transfer utility for some additional tips on getting RXTX working.  Ubuntu users: This works fine if you just install the RXTX libraries from the Ubuntu software center or Synaptic.

1) It is highly recommended you use Java6, OpenJDK 6 or better.  Java 5 might still work but it is untested.  Your mileage may vary.
2) Make sure the java bin directory is part of your path.
3) On the apple, type IN#2 (and return) from the basic prompt and leave it alone.
4) Go to the command line and CD to the directory where you extracted AGS.  It should be the directory which contains dist and lib directories of a2gameserver. Use the following to start AGS:
java -jar dist/ags.jar

Edit the settings to match your setup.  Port is either TCP port (6502 for applewin, 1977 for Jace) or Serial port (COM1 through COM8 in Windows, Mac would be something like /dev/tty.usbserial, and Linux should be /dev/ttyUSB0, /dev/ttyUSB1).  Save your settings and click the button to get started.  If you are not successful, read the messages for hints.  If that fails, try enabling the "Debug bootstrap" method to see what is happening (if anything) on the apple side.  

If you see nothing on the apple side with debug enabled, you are either not using a null modem cable, your cable is damaged, or you probably have settings on your COM port that AGS was not expecting.  Try using a standard communication program configured at 7 bits, No parity, 2 stop bits to communicate with the apple to verify your cable works (you'll need to also use PR#2 to make it a 2-way communication).  Apple 2 and Apple //e users should have the SSC set to 19200 baud, 8-N-1 with hardware handshaking enabled.  //c and //gs should let the serial port take its default settings.

HOW TO USE THE MENU:
Once you get the games menu on the apple ][, use the following keys:
- A-Z to jump to the part of the list starting with that letter
- Left/Right or [ and ] to go half a screen up and down.  
- On a //e, //c, or //gs, use up and down to move up and down one line.  
- On a legacy ][, use left/right to move up and down a line instead.  
- Press TAB to view more information -- from that view press V to view any screenshots.  Press tab to get back to the list.
- Press ESC to flip between the main screen and the search screen.  TAB selects fields, etc.
- One you've found the game you want to play, press Return to load it.
- If you want to go back to the menu, you have to reboot and start over.

Some games are really darn picky and only seem to work after a cold boot (turn off the computer and back on).  Other games need the computer to be warm-started at least (ctrl+apple+reset and then ctrl+reset to get to the basic prompt).

brendan.robert (a) gmail.com
http://a2gameserver.sourceforge.net
http://brendan.robert.googlepages.com
usenet: comp.sys.apple2, comp.emulators.apple2, comp.sys.apple2.programmer
