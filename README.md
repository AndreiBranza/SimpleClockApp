# SimpleClockApp

The purpose of this app was to create a very simple app and try to apply OOP as much as possible. With this in mind, I created as many methods as I could and what classes I thought to be relevant.

Instead of Date or Calendar I have used the LocalTime class from which I could easily extract the hours, minutes and seconds.
I have tried to separate as much of the code I could; with this in mind I created a another class, Utilitaries, in which I created various static methods that fulfill the following needs:
  setting the look and feel to windows;
  setting an icon to the jFrame
  creating a standard jFrame with some arguments
  
To have the clock update accordingly I used the sleep(1000) method as I found this gave the best results. A value lower than 1000 would make the app either freeze for a couple of seconds and eventually would remain behind the windows clock after about 10 seconds of continuous running.
