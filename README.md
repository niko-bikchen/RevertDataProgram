# RevertDataProgram
A program with GUI with 2 text fields: one - for inputting the data, the other for displaying reverted inputted data. Also GUI contains a "SEND" button which, using the _data_handler.jar_, calls _write()_ and _read()_ functions, implemnted in the _data_reverser.dll_. First - saves the given data, the second - returns reverted saved data.

## src folders description ##
* **misc** contains .h and .cpp files where _read()_ and _write()_ functions are declared and implemented and using which _data_reverser.dll_ was compiled
* **assets** contains: 
  1. _data_reverser.dll_ - library where _read()_ and _write()_ functions are implemented.
  1. _data_handler.jar_ - .jar file containing _DataHandler_ class which calls _read()_ and _write()_ functions implemented in the _data_reverser.dll_.
* **_revert_program_** - contains two .java files:
  1. _MainWindow.java_ - initializes GUI.
  1. _Run.java_ - contains _main()_ method, thus runs the whole program.
* **tests** contains _DataHandlerTest.java_ - java class for testing _DataHandler_ class stored in the _data_handler.jar_.

## Additional info:
Project was developed using Eclipse IDE
