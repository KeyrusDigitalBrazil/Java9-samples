javac -d mods/br.com.keyrus.commerce.services src/br.com.keyrus.commerce.services/module-info.java $(find src/br.com.keyrus.commerce.services -name "*.java")


javac -d mods/br.com.keyrus.commerce.front  --module-path mods src/br.com.keyrus.commerce.front/module-info.java $(find src/br.com.keyrus.commerce.front -name "*.java")


javac -d mods/br.com.keyrus.commerce.front  --module-path mods src/br.com.keyrus.commerce.front/module-info.java $(find src/br.com.keyrus.commerce.front -name "*.java")

 java --module-path mods -m br.com.keyrus.commerce.front/br.com.keyrus.commerce.front.Main



### GENERATE SMALL JRE
 jlink --module-path /usr/lib/jvm/java-9-oracle/jmods:mods --add-modules br.com.keyrus.commerce.front --output small-jre

 ./small-jre/bin/java -m br.com.keyrus.commerce.front/br.com.keyrus.commerce.front.Main