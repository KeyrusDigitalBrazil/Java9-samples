javac -d mods/br.com.keyrus.commerce.services src/br.com.keyrus.commerce.services/module-info.java $(find src/br.com.keyrus.commerce.services -name "*.java")


javac -d mods/br.com.keyrus.commerce.front  --module-path mods src/br.com.keyrus.commerce.front/module-info.java $(find src/br.com.keyrus.commerce.front -name "*.java")


javac -d mods/br.com.keyrus.commerce.front  --module-path mods src/br.com.keyrus.commerce.front/module-info.java $(find src/br.com.keyrus.commerce.front -name "*.java")