First things first, the .DS_Store file is a macbook thing.
Secondly, I have a makefile set up to compile and run the files, but I probably just submitted a .jar file with this attatched, so the repo is linked below if you want to check out the actual project. I haven't made a repo for jDat at the time of writing this but probably will link it somewhere later it basically lets you have "varables" within a .dat file to assign values to.

--REPOSITORIES--

Rock-Paper-Scissors Repo:
https://github.com/seby-weby/Rock-Paper-Scissors

jDat Repo:
https://github.com/seby-weby/jDat/tree/main

Finaly, after looking at some of the decompiled class code I honestly have no idea why it is necessary to split runner into a bunch of files, but
from what I could understand, each file is for a different action listener, and is used to set the listener's properties into 
"final" types, 
probably because they need to be final at compile time or something like that, but to make them easier to use and more flexible, the 
compiler does that for you at compile time (C++ has a lot of scenarios where this isn't the case and it sucks so thanks Java!).