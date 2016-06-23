package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Flor;

public class FlorDao {
	
	
	public static Boolean incluir(Flor flor) throws Exception {
		String sql = "Insert into flor(id, nome, cor, nomeCientifico) values(?,?,?,?) ";

		Connection conn;
		try {
			conn = ConnectionUtils.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);

			pstm.setInt(1, obterProximoId());
			pstm.setString(2, flor.getNome());
			pstm.setString(3, flor.getCor());
			pstm.setString(3, flor.getNomeCientifico());
			pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
	
	private static Integer obterProximoId() {
		String sql = "Select max(id) as proxId from flor";

		Connection conn;
		try {
			conn = ConnectionUtils.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();

			if (rs.next()) {
				Integer proxId = rs.getInt("proxId");
				return proxId + 1;
			}
			ConnectionUtils.close(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 1;
	}
}
