    package com.example.data;

    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.PreparedStatement;
    import java.sql.SQLException;

    public class ResultadoDao {

        private final String HOST = "auth-db719.hstgr.io";
        private final String PORT = "1521";
        private final String USER = "rm99697";
        private final String PASS = "111294";
        private final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";

        public void inserir(Integer ptsJogador, Integer ptsBot, String vencedor)
                throws SQLException {
            var con = DriverManager.getConnection(URL, USER, PASS);
            String sql = "INSERT INTO RESULTADOS_21 (ptsJogador, ptsBot, vencedor) VALUES (?, ?, ?)";

            var instrucao = con.prepareStatement(sql);
            instrucao.setInt(1, ptsJogador);
            instrucao.setInt(2, ptsBot);
            instrucao.setString(3, vencedor);

            instrucao.executeUpdate();

            con.close();
        }
    }
