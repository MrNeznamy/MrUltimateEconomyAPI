# MrUltimateEconomyAPI
## 🛠️ Developer API

### Maven Dependency

## 🛠️ Developer API

### Maven Dependency

```xml
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>

<dependency>
    <groupId>eu.mrneznamy</groupId>
    <artifactId>mrultimateeconomy-api</artifactId>
    <version>1.0.0-SNAPSHOT</version>
    <scope>provided</scope>
</dependency>
```
## Usage

### You can access the API using the static instance:
```java
MrUltimateEconomyAPI api = MrUltimateEconomyAPI.getInstance();

// Get player balance
double balance = api.getBalance(player, "dollar");

// Modify balance
api.give(player, "dollar", 100.0);
api.take(player, "dollar", 50.0);
api.set(player, "dollar", 1000.0);
```
