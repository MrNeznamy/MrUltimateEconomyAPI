# MrUltimateEconomyAPI

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

if (api == null) {
    // MrUltimateEconomy plugin is not loaded
    return;
}
OfflinePlayer player = Bukkit.getOfflinePlayer("Notch");

// Get balance
double balance = api.getBalance(player, "dollars");

// Give money
api.give(player, "dollars", 100.0);

// Take money
api.take(player, "dollars", 50.0);

// Set exact balance
api.set(player, "dollars", 1000.0);

// Alias for take()
api.withdraw(player, "dollars", 25.0);

OfflinePlayer player = Bukkit.getOfflinePlayer("Notch");

// Give money using Vault currency
api.giveVault(player, 200.0);

// Withdraw money using Vault currency
api.withdrawVault(player, 75.0);

// Get Vault currency name
String vaultCurrency = api.getVaultCurrencyName();

List<String> currencies = api.getCurrencies();

for (String currency : currencies) {
    System.out.println("Registered currency: " + currency);
}

```
