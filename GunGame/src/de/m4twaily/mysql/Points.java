package de.m4twaily.mysql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class Points {

	public static boolean isUserExisting(UUID uuid) {
		try {
			PreparedStatement ps = MySQL.getConnection().prepareStatement("SELECT Kills, Deaths FROM points WHERE UUID = ?");
			ps.setString(1, uuid.toString());
			ResultSet rs = ps.executeQuery();

			return rs.next();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static Integer getPoints(UUID uuid) {
		try {

			PreparedStatement ps = MySQL.getConnection().prepareStatement("SELECT Kills FROM points WHERE UUID = ?");

			ps.setString(1, uuid.toString());
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				return rs.getInt("Kills");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;

	}
	
	public static Integer getDeaths(UUID uuid) {
		try {

			PreparedStatement ps = MySQL.getConnection().prepareStatement("SELECT Deaths FROM points WHERE UUID = ?");

			ps.setString(1, uuid.toString());
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				return rs.getInt("Deaths");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;

	}

	public static void addCoins(UUID uuid, int kills, int deaths) {
		int currentValue = getPoints(uuid);
		int currentDeaths = getDeaths(uuid);

		try {
			if (isUserExisting(uuid)) {

				PreparedStatement ps = MySQL.getConnection()
						.prepareStatement("UPDATE points SET Kills = ?, Deaths = ? WHERE UUID = ?");

				ps.setInt(1, currentValue + kills);
				ps.setString(3, uuid.toString());
				ps.setInt(2, currentDeaths + deaths);

				ps.executeUpdate();

			} else {

				PreparedStatement ps = MySQL.getConnection()
						.prepareStatement("INSERT INTO points (UUID, Kills, Deaths) VALUES (?,?,?)");

				ps.setInt(2, 0 + kills);
				ps.setString(1, uuid.toString());
				ps.setInt(3, 0 + deaths);

				ps.executeUpdate();

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void removeCoins(UUID uuid, int value) {
		int currentValue = getPoints(uuid);

		try {
			if (isUserExisting(uuid)) {

				PreparedStatement ps = MySQL.getConnection()
						.prepareStatement("UPDATE points SET Kills = ? WHERE UUID = ?");

				ps.setInt(1, currentValue - value);
				ps.setString(2, uuid.toString());

				ps.executeUpdate();

			} else {

				PreparedStatement ps = MySQL.getConnection()
						.prepareStatement("INSERT INTO points (UUID, Kills) VALUES (?,?)");

				ps.setInt(2, currentValue - value);
				ps.setString(1, uuid.toString());

				ps.executeUpdate();

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void setCoins(UUID uuid, int value) {
		try {
			if (isUserExisting(uuid)) {

				PreparedStatement ps = MySQL.getConnection()
						.prepareStatement("UPDATE points SET Kills = ? WHERE UUID = ?");

				ps.setInt(1, value);
				ps.setString(2, uuid.toString());

				ps.executeUpdate();

			} else {

				PreparedStatement ps = MySQL.getConnection()
						.prepareStatement("INSERT INTO points (UUID, Kills) VALUES (?,?)");

				ps.setInt(2, value);
				ps.setString(1, uuid.toString());

				ps.executeUpdate();

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
