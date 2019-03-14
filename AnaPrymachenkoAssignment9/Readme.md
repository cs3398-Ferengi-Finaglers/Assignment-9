Ana Prymachenko - I contributed by creating the CarOptions, SuperCharger, PaintColor, SportWheels, Airscoop, and CarMain classes. As well as decorating six different cars. 

Explanation of why my code follows: 

1.	Single Responsibility Principle: My code follows this principle because every class only serves one type of user – from those who only want a basic car to those who want a painted car with air scoop and sport wheels. The classes allow the users to get customization but at the same time only bring one option to the table. 

2.	Open Close Principle: My code follows this principle because the BasicCar can be customizable by the decorator, CarOptions, and the classes that inherit from the decorator. However, BasicCar is closed for modification. 

3.	Liskov Substitution Principle: My code follows this principle because the inherited classes can be substituted for the base class. The not only add on to the base class, they also call it in their constructors. Therefore, if one to only use the inherited classes, they would also get the functionality of the base class. 

4.	Interface Segregation Principle: My code follows this principle because, my interface, ICar has only one method, GetDescription(), that is extended by the classes. This makes every class that extends it, use the method because they are in need to, not because they are forced to by a fat interface. 

5.	Dependency Inversion Principle: My code follows this principle because the base class does not depend on the details of the inherited classes. In fact, the base class knows nothing of the details. The inherited classes are the ones who are in need of the generalization from the base class. 

