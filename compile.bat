javac -d mods\br.com.keyrus.commerce.services src\br.com.keyrus.commerce.services\module-info.java @commerces-services-classes.java


javac -d mods\br.com.keyrus.commerce.front  --module-path mods src/br.com.keyrus.commerce.front/module-info.java src/br.com.keyrus.commerce.front/br/com/keyrus/commerce/front/Main.java

java --module-path mods -m br.com.keyrus.commerce.front/br.com.keyrus.commerce.front.Main



### GENERATE SMALL JRE
 jlink --module-path "C:\Program Files\Java\jdk-9.0.4\jmods";mods --add-modules br.com.keyrus.commerce.front --output small-jre

 small-jre\bin\java -m br.com.keyrus.commerce.front/br.com.keyrus.commerce.front.Main