package eu.mrneznamy.mrultimateeconomy.api;

import org.bukkit.OfflinePlayer;

/**
 * Developer API for MrUltimateEconomy.
 * <p>
 * To use this API, add the dependency to your pom.xml:
 */
public abstract class MrUltimateEconomyAPI {

    private static MrUltimateEconomyAPI instance;

    /**
     * Gets the instance of the API.
     *
     * @return The API instance, or null if the plugin is not loaded.
     */
    public static MrUltimateEconomyAPI getInstance() {
        return instance;
    }

    /**
     * Sets the API instance. Internal use only.
     *
     * @param api The implementation instance.
     */
    public static void setInstance(MrUltimateEconomyAPI api) {
        instance = api;
    }

    /**
     * Gets the balance of a player in a specific currency.
     *
     * @param player       The player to check.
     * @param currencyName The name of the currency (e.g., "dollar").
     * @return The balance, or 0 if the currency does not exist.
     */
    public abstract double getBalance(OfflinePlayer player, String currencyName);

    /**
     * Gives money to a player.
     *
     * @param player       The player to give money to.
     * @param currencyName The name of the currency.
     * @param amount       The amount to give.
     */
    public abstract void give(OfflinePlayer player, String currencyName, double amount);

    /**
     * Takes money from a player.
     *
     * @param player       The player to take money from.
     * @param currencyName The name of the currency.
     * @param amount       The amount to take.
     */
    public abstract void take(OfflinePlayer player, String currencyName, double amount);

    /**
     * Sets the balance of a player.
     *
     * @param player       The player to set the balance for.
     * @param currencyName The name of the currency.
     * @param amount       The new balance.
     */
    public abstract void set(OfflinePlayer player, String currencyName, double amount);

    /**
     * Withdraws money from a player (alias for take).
     *
     * @param player       The player to withdraw money from.
     * @param currencyName The name of the currency.
     * @param amount       The amount to withdraw.
     */
    public abstract void withdraw(OfflinePlayer player, String currencyName, double amount);

    /**
     * Withdraws money from a player using the default Vault currency.
     *
     * @param player The player to withdraw money from.
     * @param amount The amount to withdraw.
     */
    public abstract void withdrawVault(OfflinePlayer player, double amount);

    /**
     * Gives money to a player using the default Vault currency.
     *
     * @param player The player to give money to.
     * @param amount The amount to give.
     */
    public abstract void giveVault(OfflinePlayer player, double amount);

    /**
     * Gets the name of the default Vault currency.
     *
     * @return The name of the Vault currency, or null if not set.
     */
    public abstract String getVaultCurrencyName();

    /**
     * Gets a list of all registered currency names.
     *
     * @return A list of currency names.
     */
    public abstract java.util.List<String> getCurrencies();
}
