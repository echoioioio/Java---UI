# Java---UI

Project Introduction

A GUI application for managing stock items from two CSV files. The application will update the stock quantities in another CSV file when stock is added or sold. It will also display a low stock alert if the amount falls below a certain threshold.

In the Main class, it will lunch the GUI application MainWindow.

![image](https://user-images.githubusercontent.com/98097127/158166869-45623155-316c-4248-8742-200b2ede3db6.png)


After the GUI application is launched, uses can select a product item and then click buy or sell, it will pop up an input box that asks users to enter the quantity.

![image](https://user-images.githubusercontent.com/98097127/158164803-5c888cb1-a887-47a7-9544-ff5fa505b383.png)

If the sales quantity that the user input is larger than the stock, it will pop up an error message “Stock is not enough. Please re-enter the quantity.” User can re-enter the quantity again after clicking ok.

![image](https://user-images.githubusercontent.com/98097127/158166623-25c7bcb5-8689-4d96-9c4b-ea741a92329b.png)

After user entering a valid quantity, the new stock will be calculated. And if the stock is less than 6, it will pop up a low stock alert with product code.

![image](https://user-images.githubusercontent.com/98097127/158166666-5dc1bb59-d0c8-4e23-b703-2c283a04aecf.png)

I also add a function that allows users to add new products. Uses can enter product information and click ok.

![image](https://user-images.githubusercontent.com/98097127/158166720-d2d09014-737d-4054-87de-acb8b3943f67.png)

![image](https://user-images.githubusercontent.com/98097127/158166735-fb8ac010-9cca-4d0d-89b1-53299d4702f2.png)


