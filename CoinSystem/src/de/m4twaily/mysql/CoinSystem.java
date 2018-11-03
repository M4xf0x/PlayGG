package de.m4twaily.mysql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class CoinSystem {

	/**
	 * dont use this, only for System
	 **/

	public boolean isUserExisting(UUID uuid) {
		try {
			PreparedStatement ps = MySQL.getConnection().prepareStatement("SELECT Money FROM money WHERE UUID = ?");
			ps.setString(1, uuid.toString());
			ResultSet rs = ps.executeQuery();

			return rs.next();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * getMoney returns Integer
	 **/

	public Integer getMoney(UUID uuid) {
		try {

			PreparedStatement ps = MySQL.getConnection().prepareStatement("SELECT Money FROM money WHERE UUID = ?");

			ps.setString(1, uuid.toString());
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				return rs.getInt("Money");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;

	}

	/**
	 * addMoney
	 **/

	public void addMoney(UUID uuid, int value) {
		int currentValue = getMoney(uuid);

		try {
			if (isUserExisting(uuid)) {

				PreparedStatement ps = MySQL.getConnection()
						.prepareStatement("UPDATE money SET Money = ? WHERE UUID = ?");

				ps.setInt(1, currentValue + value);
				ps.setString(2, uuid.toString());

				ps.executeUpdate();

			} else {

				PreparedStatement ps = MySQL.getConnection()
						.prepareStatement("INSERT INTO money (UUID, Money) VALUES (?,?)");

				ps.setString(1, uuid.toString());
				ps.setInt(2, 0 + value);

				ps.executeUpdate();

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * removeMoney
	 **/

	public void removeMoney(UUID uuid, int value) {
		int currentValue = getMoney(uuid);

		try {
			if (isUserExisting(uuid)) {

				PreparedStatement ps = MySQL.getConnection()
						.prepareStatement("UPDATE money SET Money = ? WHERE UUID = ?");

				ps.setInt(1, currentValue - value);
				ps.setString(2, uuid.toString());

				ps.executeUpdate();

			} else {

				PreparedStatement ps = MySQL.getConnection()
						.prepareStatement("INSERT INTO money (UUID, Money) VALUES (?,?)");

				ps.setInt(2, currentValue - value);
				ps.setString(1, uuid.toString());

				ps.executeUpdate();

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Achtung: nicht benutzen, ist im System selber gesetzt (Config.yml)
	 **/

	public void setFirstMoney(UUID uuid, int value) {
		try {

			PreparedStatement ps = MySQL.getConnection()
					.prepareStatement("INSERT INTO money (UUID, Money) VALUES (?,?)");

			ps.setString(1, uuid.toString());
			ps.setInt(2, value);

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * setMoney
	 **/

	public void setMoney(UUID uuid, int value) {
		try {
			if (isUserExisting(uuid)) {

				PreparedStatement ps = MySQL.getConnection()
						.prepareStatement("UPDATE money SET Money = ? WHERE UUID = ?");

				ps.setString(2, uuid.toString());
				ps.setInt(1, value);

				ps.executeUpdate();

			} else {

				PreparedStatement ps = MySQL.getConnection()
						.prepareStatement("INSERT INTO money (UUID, Money) VALUES (?,?)");

				ps.setString(1, uuid.toString());
				ps.setInt(2, value);

				ps.executeUpdate();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
