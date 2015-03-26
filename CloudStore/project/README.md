#### CloudStore Example - Extractor project
------------------------------------------------------

Contents:
---------
1. Installation & Operation
2. Main Differences to original Version
3. Main Differences to SAP version

=================================================================
=================================================================

1. Installation & Operation
---------------------------
1) Install Tomcat, MySQL
   (I used XAMPP 1.8.1; Apache Tomcat/7.0.30; MySQL 5.5.27)
   
2) Configure the Tomcat as a Server in Eclipse Java EE
   (I used Eclipse Java EE IDE for Web Developers; Juno Service Release 2)
   
3) Start your MySQL server

4) Run the database configuration scripts (currently, only available in original sources; working on that one)

5) Modify the following file according to your MySQL installation:
   /30_Project_servlets_mysql/servlets/database.properties
   
6) Run the project via "Run on Server" in Eclipse


2. Main Differences to original Version
---------------------------------------
1) General
- only included folders "images", "servlets", and "build" from original sources
  (i.e., RBE, database population, and image generation are not included - only the TCP-W system itself)
- removed unnecessary dependencies to RUBIS
- put every servlet into "tpcw" package

2) New Technologies
- updated to newest Tomcat and mySQL versions
- integrated into Eclipse Java EE version

3) Required Changes for Project structure
- specified mappings in web.xml file
- adapted path to images folder

4) Modified TPCW_Util class
- reduced to random and dig_syl methods

5) Generated serialVersionUIDs

6) Specified generic Vector types

3. Main Differences to SAP version
----------------------------------
1) General
- different URLs for images

2) Minor URL modifications
- SAP altered 1 URL in TPCW_admin_request_servlet.java
- SAP altered 1 URL in TPCW_order_inquiry_servlet.java
- SAP altered 1 URL in TPCW_shopping_cart_interaction.java
- SAP added "jsessionid="+req.getRequestedSessionId()" entries in TPCW_home_interaction.java

3) Database
- SAP reimplemented (?) TPCW_Database.java
- SAP added TPCW_DatabaseKeys.java
- SAP added TPCW_DatabaseOrig.java

4) Multi-tenancy
- SAP added tenant information in TPCW_say_hello.java

5) Number of Items
- SAP modified upper part of TPCW_Util.java that is related to the number of items