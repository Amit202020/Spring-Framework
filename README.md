#Spring Framework

#CORE SPRING
Spring Introduction :
Why Spring Framework : 
Spring Architecture  
Spring Setup  
IOC Container : Core and J2EE 
IOC Container :  Scope
DI for Primitive Type
   	1.Setter Injection
   	2.Constructor Injection
DI for Secundary Type :
DI for Collection :
Pass by Value - InnerBean
Pass by Ref - Secundary Type
Manage Spring POJO Life Cycle 
         Programmetic
         Declarative
         Annotation
@Required 
C and P namespace 
Autowire
@Autowired
Update in Spring 5.0 
Removed from Spring 5
Changes to the spring core in Spring 5
Functional programming with Kotlin
Reactive Programming with WebFlux

Spring JDBC:
Spring MVC :
      - Controller
      - ViewResolver
      - HandlerMapping
      - @ModelAttribute , BindingResult
      - Login Application     
Spring  AOP:





                                                                  Spring Introduction 

                                                                                 1.   It is used to create   Enterprise Level Application
 
                                                                                    initial name -    Interface  21
                                                                                    2004     -     Spring 1.0  (Rod Jhonson)   Spring  Organization
                                                                                    2013     -    Spring  4.x 
                                                                                    2018     -    Spring  5.0
										                                                                2022     -    Spring  5.3		


                                                                                  2.  Spring  Framework is Light Weight Component
                                                                                  3.  Spring Framework support loosely coupled architecture
                                                                                  4.  Different tier will interact with each other using POJO 
                                                                                  5.  Open Source
                                                                                  6.  Easy  to   Unit  Test
                                                                                  7.  Spring Support  Dependency Injection (Inversion Of Control)

                                                          
                                              Tightly Coupled                                                                                            

                                                  class      SearchFlightService{
                                                           SearchFlightDAO  obj=new SearchFlightDAO()
                                                  }

                                                   class   SearchFlightDAO{

                                                  }
                                            
                                             Loosely Coupled
                                              
                                                 interface    C{
                                                  }
                                                 class      A  extends  C{
                                                           C       ref  = new   B();       
                                                  }
                                                  class   B  extends  C{

                                                  }
                                           
                                              #Spring  Architecture

                                                                        

                                              #Spring Framework  Setup :
                                                            1.   Eclipse  IDE  
                                                            2.   Download all the spring 5  jars
                                                                            spring-framework-5.0.5.RELEASE-dist
                                                                                          
#Spring  CORE 

                                   Spring  Container : Core and J2EE 

                                                    1.  Core   Container  / Bean Factory Container
                                                    2.  J2EE    Container  / Application Context Container

                                                    - org.springframework.beans
                                                    - org.springframework.context

                                   #Task Of   IOC  Container :
                                                   1.  Creation Of Object
                                                   2.  Initialize Object Attribute
                                                   3.  Manage the lifecycle of the object


                                  #IOC Container : Core and J2EE 
                                                     
                                  1. Core  container / Bean Factory Container
                                                    s-1  create  java project
                                                    s-2  include all the spring jars
                                                    s-3  add  spring.xml
                                                    s-4  add client.java and Emp.java

                                                        loading                        client request
                                  object creation         NO                                YES


                                    2.  J2EE   container  / Application Context Container
                                                    s-1  create  java project
                                                    s-2  include all the spring jars
                                                    s-3  add  spring.xml
                                                    s-4  add client.java and Emp.java
                                 
                                                       loading                        client request
                                  object creation         YES                               NO



                                  #IOC Container : Scope
                                                    1. singleton  - only one object will create for multiple request
                                                                  - default scope of IOC Container

                                                    2. prototype - multiple object will create for multiple request
                                                                   - not default scope of IOC Container




                                                    //singleton

                                                                                        Bean factory                               Application Context
                                                    loading                                 NO                                                 YES                     

                                                    client request                          YES                                                 NO



                                                      //prototype

                                                                                         Bean factory                               Application Context
                                                    loading                                 NO                                                 NO                    

                                                    client request                          YES                                                 YES




#DI for Primitive Type
   			1.Setter Injection -  IOC container inject attribute inside POJO using setter
   			2.Constructor Injection -  IOC container inject attribute inside POJO using constructor


                                        #Setter Injection 
                                                        -  IOC container inject attribute inside POJO using setter
                                                                          s-1  create  java project
                                                                          s-2  include all the spring jars
                                                                          s-3  add  spring.xml
                                                                          s-4  add client.java and Dept.java (getters and setters)

                                        #Constructor  Injection
                                                       - IOC container inject attribute inside POJO using constructor
                                                       - If we have  two overloaded constructor then by default it will call constructor with string.
                                                       - By using type container will overload the constructor
                                                       - If we have more than one parameter then we can use index to point each position in the constructor.
                                                                          s-1  create  java project
                                                                          s-2  include all the spring jars
                                                                          s-3  add  spring.xml
                                                                          s-4  add client.java 
                                                                          s-5  Dept.java (constructor)


DI for Secundary Type:
DI for Collection :
Manage Spring POJO Life Cycle 
Programmetic
Declarative
Annotation




                                               //DI for Secundary Type:
                                               
                                                                 HAS  A  -                     Car   have   Engine 
                                                                                               Order  have  OrderItem
                                                                                               Employee have Dept

                                                                                               
                                                         class    Car {
                                                                    Engine Obj=new Engine();
                                                         }
                                                          class   Engine{

                                                          }
                                                                          s-1  create  java project
                                                                          s-2  include all the spring jars
                                                                          s-3  add  spring.xml
                                                                          s-4  add client.java 
                                                                          s-5  Car.java , Engine.java

                                              pass by  ref   -    We can pass the ref of an object.
                                                                            <property name="engine" ref="eobj"></property>

                                              pass by value -     Inner Bean



  HandsOn - Secondary Type Exception

  

  #DI for Collection
                                                 class    Student {
                                                             int   studId;
                                                             String  studName;
                                                             List<String>   emails;
                                                             Set<String>   phone;
                                                             Map<String,String>  ref;
                                                }

                                                                          s-1  create  java project
                                                                          s-2  include all the spring jars
                                                                          s-3  add  spring.xml
                                                                          s-4  add client.java 
                                                                          s-5  Student.java 
                            -
                        
Manage Spring POJO Life Cycle 
Programmetic
Declarative
Annotation
@Required
Autowire
@Autowired
C and P namespace 
Spring JDBC/AOP/MVC
Update in Spring 5.0 
Removed from Spring 5
Changes to the spring core in Spring 5
Functional programming with Kotlin
Reactive Programming with WebFlux



#Manage Spring POJO Life Cycle 
         		                                      Programmetic 
                                                  Declarative 
                                                  Annotation

                                                #Programmetic
                                                    - Bean class should implement 2 interface  ie  InitializationBean,DisposableBeans 
                                                                                 1.  Create  Java Project
                                                                                 2.  Add all the jars
                                                                                 3.  Create  spring.xml
                                                                                 4.   Create  EmpDb.java
                                                                                 5.   create client.java

     
                                                              class     EmpDb  implements InitializationBean,DisposableBean{

                                                                               private String driver;
                                                                               private String url;
                                                                               private String userid;
                                                                               private String pass;
                                                                               Connection con =null

                                                                               afterPropertiesSet(){
                                                                                             class.forName("");
                                                                                             con= DriverManager.getConnection("","","")
                                                                                             System.out.println("connection success")
                                                                               }
                                                                                public void insert(){
                                                                                             System.out.println("Data inserted");
                                                                                }
                                                                                destroy(){
                                                                                             con.close()
					                                                                                   System.out.println("connection closed")
                                                                                }
			                                                              }
                                                                       

                                                        - Declarative
                                                                    - we will declare lifecycle method inside xml file.
                                                                                my-init()
                                                                                my-destroy()

                                                                                 1.  Create  Java Project
                                                                                 2.  Add all the jars
                                                                                 3.  Create  spring.xml
                                                                                 4.   Create  EmpDb.java
                                                                                 5.   create client.java

                                                        - Annotation
                                                                    - we will declare lifecycle method using annotation
                                                                                      @PostConstruct
                                                                                      minit()

                                                                                      @PreDestroy
                                                                                      mdestroy()

                                                                                 1.  Create  Java Project
                                                                                 2.  Add all the jars
                                                                                 3.  Create  spring.xml
                                                                                 4.  Create  EmpDb.java
                                                                                 5.  Create client.java


                                                #@Required : it is deprecated after spring 5.1

                                                                       - If we use @Required for an arrtibute inside the bean class then
                                                                          we must have to provide the property element for that attribute inside the xml file.
                                                                                 
                                                                                 1.  Create  Java Project
                                                                                 2.  Add all the jars
                                                                                 3.  Create  spring.xml
                                                                                 4.   Create  EmpDb.java
                                                                                 5.   create client.java


                                              #Object  Relationship  //  Secundary Type
                                                         -  IOC   Container can do Dependency Injection for  Secondary Type


                                              #Autowire
                                                         - IOC container  can autowire relationship between the bean.
                                                         - auto wire  can be implemented by 
                                                                                1.  byType
                                                                                2.  byName
                                                                                3. constructor
                                                                                4. autodetect - setter and constructor

                                                             class      Bus{                   class    Engine { }  
                                                                    Engine   engine;
                                                             }

                                                                                 1.  Create  Java Project
                                                                                 2.  Add all the jars
                                                                                 3.  Create  spring.xml
                                                                                 4.   Create  Bus.java , Engine.java
                                                                                 5.   create client.java

                                                             //1. byType
                                                                             - IOC  container automatically inject engine object inside bus object.
                                                                             - IOC container will not inject those object for whom autowire-candidate=false

                                                             //2. byName
                                                                             - IOC container will inject the Engine class object inside the Bus class by the
                                                                               name of the Engine class object that we have created in the Bus class.

                                                            //3. constructor
                                                                              -IOC container automatically injecting engine class object inside bus class
                                                                               using constructor.

                                                            //4. autodetect
                                                                                   1st  -  default constructor , setter
                                                                                   2nd - para constructor


                                                            //@Autowired
                                                                                - no default const required
                                                                                - no setter is required
                                                                                - no para const is required
                                                                                - we have to create an object of 
                                                                                                   AutowiredAnnotationBeanPostProcessor







                                                        
                                                       //namespace
                                                                      - it is used to differentiate same name element 
                                                                      - default namespace
                                                                               xmlns="http://www.atos.net/emp"     URL
                                                                               xmlns="atos|emp|dev|ban"            URN
                                                                       - prefixed namespace
                                                                                 xmlns:emp="http://www.atos.net/emp"

                                                        emp.xml
                                                       <emp:employees  xmlns="http://www.atos.net/emp">
                                                              <emp:employee>
                                                                         <emp:id>1001</emp:id>
                                                                         <emp:name>Srini</emp:name>
                                                              </emp:employee>
                                                       </emp:employees>
                                                         
                                                        dept.xml
                                                      <dept:departments  xmlns:dept="http://www.atos.net/emp">
			                                                        <dept:department>
                                                                         <dept:id>20</dept:id>
                                                                         <dept:name>admin</dept:name>
                                                              <dept:department>
                                                      </dept:departments>


                  
                C and P namespace
                Spring JDBC/AOP/MVC
	          		Update in Spring 5.0 
	          		Removed from Spring 5
	          		Changes to the spring core in Spring 5
	          		Functional programming with Kotlin
	          		Reactive Programming with WebFlux


#C and P namespace
                                             IOC  container implement  DI  using  C and P namespace                        
                                             C namespace -  Dependency Injection Using Constructor
                                             P namespace -  Dependency Injection Using Setter
                                             We will use the spring.xml grammer  as  .xsd
                                                                                 1.  Create  Java Project
                                                                                 2.  Add all the jars
                                                                                 3.  Create  spring.xml
                                                                                 4.   Create  Student.java 
                                                                                 5.   create client.java


#Spring DataBase Interaction

                                          DAO - Data Access Object           1.  database interaction    ------    sun/jdbc    --------------------   [database]
                                                                             2.  xml  data  store interaction -----  Jax-p/jax-b   --------------------   [database]
                                                                             3.  ORM  - Object Relational Model   -- EJB JPA   --------------------   [database]
                                                                                                                               Hibernate
                                                                                                                               iBatis
                                                                                                                               
                                          Spring Provider   -                Spring  JDBC
                                                                             Spring  ORM (Hibernate/JPA)



                                          Spring  JDBC 
                                                                          -  JDBCTemplate
                                                                                 1.  Create  Java Project
                                                                                 2.  Add all the jars
                                                                                 3.  Create  spring.xml
                                                                                 4.  Create  Employee.java 
                                                                                 5.  Create client.java


INSIDE    DAO
JDBC   Spring JDBC       
Spring ORM(Hibernate)
Spring ORM(JPA)


#Purpose of JPA
Object-Relational Mapping (ORM):
Maps Java objects (entities) to database tables without manual SQL queries.

Abstraction from JDBC:
Developers don’t need to manage low-level JDBC code (like ResultSet, PreparedStatement, connection management, etc.).

Standardization:
Provides a standard API across multiple ORM frameworks (e.g., Hibernate, EclipseLink, OpenJPA), so code is portable.

Entity Lifecycle Management:
Handles object states (transient, persistent, detached, removed) automatically.

Query Language (JPQL):
Provides JPQL (Java Persistence Query Language), which is object-oriented and independent of the database.




#Advantages of JPA
Reduced Boilerplate Code:
Removes repetitive JDBC tasks (opening/closing connections, mapping rows to objects).
Database Independence:
Applications can switch between databases with minimal changes.
Improved Productivity:
Developers focus on domain models instead of SQL and schema management.
Automatic Schema Generation:
Can auto-create, update, or validate database schemas from entity classes.
Caching & Performance:
Provides first-level and second-level caching, lazy loading, and batch fetching for optimized performance.
Transaction Management:
Works seamlessly with Java EE/Jakarta EE and Spring for declarative transaction management.
Clear Domain Modeling:
Entity classes represent business concepts directly, making code easier to read and maintain.



#Difference of Spring Data JPA and Hibernate
JPA = specification 
JPA Provider = Hiberbate , EclipseLink

Hibernate = ORM Framework
         - Implements JPA.
         - Provides its own query language (HQL – Hibernate Query Language).
         - Offers advanced ORM features beyond JPA (like caching strategies, native SQL support, multi-tenancy, etc.

Spring Data JPA  :  
        - It is a Spring Framework project built on top of JPA
        - Provides CrudRepository, JpaRepository, and Paging/Sorting repository interfaces.
        - Automatically generates queries from method names (findByName, findByEmailAndStatus).
        - Simplifies custom query definition (via JPQL, native SQL, or @Query).
        - Integrates with Spring Boot for easy configuration.
                   									



		                                                           
                                                                                
	Spring MVC :
            Controller
            ViewResolver
            HandlerMapping
            @ModelAttribute , BindingResult
            LAB- Login Application
           
	Spring   AOP:
       			1. aopalliance-1.0.jar ,asm-5.1.0.jar, aspectjrt.jar,aspectj-weaver.jar,cglib-nodep-3.1.jar    
	Update in Spring 5.0 
	Removed from Spring 5
	Changes to the spring core in Spring 5
	Functional programming with Kotlin
	Reactive Programming with WebFlux






                                                      J2EE  Design Pattern
                                                                            presentation
                                                                                           - Front Controller 
                                                                                           - Intercepting Filter
                                                                                           - ContextObject
                                                                             Business Tier
                                                                                           - Business Delegate
                                                                                           - Service Locator
                                                                                           - Session Facade
                                                                             Integration Tier
                                                                                           - Data Access  Object
                                                                                           - Web service Brocker


                                                     Spring MVC :
                                                              - We create  Enterprise Level Application
                                                              - Controller , Service , DAO  are all pojo class.  
                                                              - Front controller is  DispatcherServlet
                                                              - i18n internationalization  - multiple language support
                                                             

                                                  UseCase : Search
                                                  
                                                       [CLIENT]                              [Middle]                                                                                                                               [EIS]
                                                     SearchView.jsp  ---->  SearchController.java  -->  SearchService.java  --->  SearchDAO.java   ---->         [DB]
                                                                                                                                                                                                                       [Spring JDBC]
                                                      [Spring web]                      [Spring MVC]                           [Spring AOP]
                                                     ----------------------------------------------------------------------------------------------------------------
                                                                                                               Spring   IOC


                                                    #Life Cycle Of  Spring MVC Application:
                                                                         1. request first examined by Dispatcher Servlet.
                                                                         2. Dispatcher Servlet  consult handler-mapping defined in a configuration file, select
                                                                              a controller and delegate to it to handle the request.
                                                                         3. controller will interact with service and dao and get some output.
                                                                         4. Controller  return the output as ModelandView  object back to the DispatchServlet
                                                                         5. DispatcherServlet  looks for the view resolver to look for the view type.
                                                                         6. Dispatcher Servlet get the view type from the ViewResolver and send the response  to the client.


                       Spring MVC Application :   Login
                       UseCase : Login
                                                       [CLIENT]                              [Middle]                                                                                                                               [EIS]
                       home.jsp     -      LoginView.jsp  ---->DS ->  LoginController.java  -->  LoginService.java  --->  LoginDAO.java   ---->         [DB]
                                                         V                              C               C                                                   S                                        D                                          T
                                                         s-1    create  dynamic web application
                                                         s-2    add all the jar required.
                                                         s-3    view  in jsp folder
                                                                              Login.jsp
                                                                              LoginSuccess.jsp
                                                                              LoginFailure.jsp
                                                         s-4    add the DispatherServlet path in the web.xml
                                                         s-5    add  the configuration file.   spring.xml === spring-dispatcher-servlet.xml



                                         Spring AOP  -    Aspect   Oriented  Programming

                                                                     Aspect  === Service (tx,webservice,logger,auth,auth,security)
                                                                      Point cut   = it is a condition to execute a service for a business method.
                                                                     Advice  =  Service Provider        

                                                                                        - Method Before Advice    -   service before execution of business
                                                                                        - After returning Advice   - service after execution of business
                                                                                        - method interceptor    - service execution before and after business execution
                                                                                        - throws advice  - if business throw exception                                               

                                                                                 logger()                        - aspect
                                                                           getAllEmpDetails()        -  business
                                                                                  logger()                       - aspect

                                                                  proxy  = business in combination with service create proxy.
                                                                   aopalliance-1.0.jar ,asm-5.1.0.jar, aspectjrt.jar,aspectj-weaver.jar,cglib-nodep-3.1.jar  

                                        Spring AOP - 
                                                            //business
                                                               class    Bank{        
                                                                           int   amt = 50000;
                                                                           String accno  = "sbi1234";
                                                                           public int  deposit(int  amt , String ac){
                                                                                                   if(ac.equals(this.accno)){
                                                                                                                this.amt=this.amt+amt;
                                                                                                                 return this.amt;
                                                                                                    }else{
                                                                                                                    return 0;
                                                                                                     }                                                                                                            
                                                                           }
                                                                }
                                                               //service

                                                                class  LogBefore  implements MethodBeforeAdvice{
                                                                                          method1(){
                                                                                           }
                                                                   }
                                                                    

                                                                Bank    b  = new Bank();//target
                                                                LogBefore  l = new LogBefore(); // service

                                                                ProxyFactoryBean   pfb = new   ProxyFactoryBean()
                                                                pfb.setTarget(b)
                                                                pfb.setInterceptorBean(new String(){I}) 

                                                                Bank proxy =  pfb.getBean("l")
                                                                 int amt = proxy.deposit(5000,"sbi1234")

                                                                                        //- Method Before Advice    -   service before execution of business
                                                                                        //- After returning Advice   - service after execution of business
                                                                                      //  - method interceptor    - service execution before and after business execution
                                                                                       // - throws advice  - if business throw exception 

                                                                                                 User Defined Exception class

                                                                                                 class   WrongAccNoException extends  Exception  {
                                                                                                              WrongAccNoException (){
                                                                                                                    System.out.println("Please enter correct acc no");
                                                                                                              }
                                                                                                  }                                              

                                                         
                Update in Spring 5.0 
	          		Removed from Spring 5
	          		Changes to the spring core in Spring 5
	          		Functional programming with Kotlin
	          		


                                                   //Update in Spring 5.0 
                                                                      1.  Some features in spring  core introduced
                                                                                         A.  default method 
                                                                                         B.  Module
                                                                                         C.  @NonNull , @NonNullApi , @Nullable      
                                                                      2.  Major Base Line Update 

                                                                             ------->Spring 5.0      J2EE   7+
                                                                                       - JDK 8 , Servlet 3.1 , JPA 2.1 , JMS  2.0  , Hibernate 5

                                                                             ------->     Spring  5.x     J2ee  8+
                                                                                       - Servlet 4.0 , JPA 2.2  , Tomcat 9 ,  Hibernate 6

                                                                       3.  Functional Programming using Kotlin
                                                                       4.  Reactive Programming using web flux
        

                                                   //Removed features from Spring 5
                                                                      1.  Spring Web  -  tiles 2.x (web.view.tiles)is removed from Spring 5
                                                                                                     -  tiles 3.x is used in Spring 5
                                                                      2.  Spring ORM  - Hibernate 3.x , Hibernate 4.x  is removed from Spring 5
                                                                                                      (now hibernate 5)
                                                                      3.  Portlets , velocity , XMLBean , Guava ........
                                                                      4.  beans.factory.access 
                                                                                                            

                                                      //Reactive Programming using web flux
                                                                 - async non-blocking approach to data processing  


                                                      Sync    Coomunication
                                                                      request  --->    immediate reply 

                                                      Async  Communication
                                                                      FF - 
                                                                      FWC -
                                                                              request  --->   no  immediate reply 

                                                      //Functional programming with Kotlin

                                                      Object Oriented Programming   
                                                                              object1   ---  object2  ---  object3  --  object4 --                                           

                                                      Functional Programming  using kotlin
                                                                              - mobile  app
                                                                              - jet brain
                                                                              - server side application

                                                                              func1   --  func2   --  func3  ---  func4  --- func5

                                                                             {  
                                                                               (a, b) ->  a+b  
                                                                               
                                                                              }
                                                                  














                                                            
































