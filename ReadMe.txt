Copy the Logger directory available in this directory to: QKSMS>src>main>java directory.


 
 In every .java class of android project include the following lines at start:
 import Logger.Logger;
 
 In every function of that class include the following lines at start :
 Logger.appendLog("className");
 