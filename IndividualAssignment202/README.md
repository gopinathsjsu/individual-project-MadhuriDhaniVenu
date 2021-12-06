# Individual-project-madhuidv

**Name** : Madhuri Dhani Venu <br />
**SJSU ID** : 015270450

### Instructions to run the project:
1) Switch to the master branch
2) Download and extract the file
3) Copy the IndividualAssignment202 folder to your IDE(Intellij) workspace
4) Import the project in IDE
5) Add all the input files to the folder/workspace where this project exists
6) Open Inventory.java which is the starting point of this application ( contains the main())
7) Enter the filename in the console when prompted
8) Upon successful execution of the project, either output.txt or error.txt will get generated based on the processing of the inputs.
9) Output.txt/error.txt will get generated in the same project folder.

## Design Patterns:
### 1) Strategy Pattern:
Strategy pattern is one of the behavioral design patterns. This is mainly used when we have multiple strategies to consider.
The input file is processed as an List<List<String>>. The static dataset is stored as a HashMap. 
The program checks the first strategy which is to check if the given order quantity is permissible or not. If this fails, an Error.txt is generated and the program terminates. If it passes, then it executes another strategy to check the capacity of each item category.
If both the strategies are successful, these items are added to the cart and the price of the cart is calculated.
![Blank diagram](https://user-images.githubusercontent.com/77411174/144794785-b4b4f9c6-45bc-4118-a71e-65b68e56e609.png)

 
### 2) Singleton Pattern:
It is a creational design pattern.It ensures the creation of a single instance of the class.
In this assignment, this pattern is used to validate the credit card. An instance of the class gets created only if the cart is valid. if the card number in the input file does not exist in the static database of cards (which is maintained as an arraylist), this cardnumber gets added to the database. 
  ![Blank diagram (1)](https://user-images.githubusercontent.com/77411174/144794831-9bc5c9bb-bd55-4478-90c6-bd6528e21e05.png)

 
 ### ScreenShots:<br />
 Below are the screenshots of the intermediate terminal aswell as the Output.txt / Error.txt files generated
  
 **Input1 - Sheet1.csv**
  ![image](https://user-images.githubusercontent.com/77411174/144794963-2778edad-ed00-450b-8e61-155f6b0885a7.png)

  
 **Input2 - Sheet1.csv**
  ![image](https://user-images.githubusercontent.com/77411174/144795020-783e46dc-2f29-4806-a4f4-494e3609eb0a.png)

  
  **Input3 - Sheet1.csv**
  ![image](https://user-images.githubusercontent.com/77411174/144795065-f3a7a058-954f-4ba2-8569-04200286d46c.png)

