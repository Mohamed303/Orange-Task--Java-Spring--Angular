# Orange-Task


## Technologies
+	MySQL Database ✅ 
+	Spring Framework ✅ 
+	Build Tool (i.e. Maven or Gradle) ✅ 
+	REST ✅ 
## Bonus
+	ORM (i.e. Hibernate) ✅ 
+	Unit Test (i.e. Junit) 
+	Angular ✅ (without login) 

### Instructions to run backend
1. The BACK-END folder to IDE and run it on port=8080.
2. For database Just create the database(name=toystore,username=root,pass=) maunally and run the application and it will create the Tables with it's entities.
3.  Then you can test using Postman.

 #### Categories
- Return all Categories (GET : localhost:8080/categories)
- Return Category (GET : localhost:8080/categories/{id})
- Add Category (POST : localhost:8080/categories) with json body
- Update Category (PUT : localhost:8080/categories) with json body
- Delete Category (DELETE : localhost:8080/categories/{id})

#### Products 
- Return all Products (GET : localhost:8080/products)
- Return Product (GET : localhost:8080/products/{id})
- Add Product (POST : localhost:8080/products) with json body
- Update Product (PUT : localhost:8080/products) with json body
- Delete Product (DELETE : localhost:8080/products/{id})

#### Relation between Products And Categories
- Return all Products bassed on Category (GET : localhost:8080/categories/{id:Category}/products)


### Instructions to run frontend
1. the FRONT-END to youe text editor and just run (ng serve)on port(4200) for angular ((6)) after installing node.js and angualr-cli.
