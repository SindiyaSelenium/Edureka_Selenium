set projectLocation=D:\Edureka Workspace\Craftsville
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\Jars\*
java org.testng.TestNG %projectLocation%\testng.xml
pause