# LoCUS
LoCUS (Logger's Common Utility Package) is a library that helps developers save their logs in 
a local storage (database/file) and easily access the data on the fly. Developers can use the 
library in Android's conventional fashion bearing only a few API changes.

### APIs 
Following are the APIs that provide you the access to logger methods that help log stack trace to the 
local database, and a file containing the logs can be generated at any point of time with the help of 
a Floating Head that accesses the logs and displays useful information about each of them.

### Initialization
The Logger can be initialized by calling *Locus.init(applicationContext)* function in your app's 
application class.

### Logging Functions
```kotlin
logI(javaClass /*TAG*/, message /*Log Message*/)
logD(javaClass /*TAG*/, message /*Log Message*/)
logE(javaClass /*TAG*/, message /*Log Message*/)
logW(javaClass /*TAG*/, message /*Log Message*/)
logWTF(javaClass /*TAG*/, message /*Log Message*/)
```
The above functions can be used to print respective log messages both to the console and to the 
local database. 

### Logger Floating Head
The floating head can be used to access the list of logs at any point of time. It can be initialized
using *LogHead.init(applicationContext)* in your app's application class.
