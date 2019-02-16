package desafioaue;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ContatoDAO {
    
    private static ContatoDAO instance = new ContatoDAO();
    private ContatoDAO(){}
    public static ContatoDAO getInstance(){
        return instance;
    }
    
    public void save(Contato contato) throws SQLException, ClassNotFoundException {
        Connection conn = DatabaseLocator.getInstance().getConnection();
         System.out.println(conn);
        Statement st = conn.createStatement();
        try{
            System.out.println("Executo");
            st.execute("inset into contato (codcontato, nome, sexo, cidade, dia, mes, ano) values ( '" + contato.getCodigo()+
                    " ', '" + contato.getNome() + " ', '" + contato.getSexo() + " ', '" + contato.getCidade() + " ', '" +
                    contato.getDia() + "', '" + contato.getMes() + "', '" + contato.getAno() + "')");
        }catch (SQLException e) {
            System.out.println("Erro no SQL save");
            throw e;
        } finally {
            closeResources(conn, st);
        }
    }
    
    public Contato find(String nome) throws SQLException, ClassNotFoundException {
        Connection conn = DatabaseLocator.getInstance().getConnection();
        Statement st = conn.createStatement();
        Contato contato = new Contato();
        
        try{
           ResultSet rs = st.executeQuery("select * from contato where nome = " + nome + "");
           while (rs.next()) {
                contato.setNome(rs.getString("nome"));
                contato.setSexo(rs.getString("sexo"));
                contato.setCidade(rs.getString("cidade"));
                contato.setDia(rs.getInt("dia"));
                contato.setMes(rs.getInt("mes"));
                contato.setAno(rs.getInt("ano"));
            }
        }catch (SQLException e) {
            System.out.println("Erro no SQL find");
            throw e;
        } finally {
            closeResources(conn, st);
        }
        return contato;
        
    }
    
    public void update(String nome, String cidade) throws SQLException, ClassNotFoundException{
        Connection conn = DatabaseLocator.getInstance().getConnection();
        Statement st = conn.createStatement();
        
        try{
            st.execute("update contato set cidade = '" + cidade + "' where nome = '" + nome + "'");
        }catch (SQLException e) {
            System.out.println("Erro no SQL update");
            throw e;
        } finally {
            closeResources(conn, st);
        }
    }
    
    public void delete(String nome) throws SQLException, ClassNotFoundException{
        Connection conn = DatabaseLocator.getInstance().getConnection();
        Statement st = conn.createStatement();
        
        try{
            st.execute("delete from contato where nome = '" + nome + "'");
        }catch (SQLException e) {
            System.out.println("Erro no SQL delete");
        } finally {
            closeResources(conn, st);
        }
    }
    
    public int contar() throws SQLException, ClassNotFoundException{
        Connection conn = DatabaseLocator.getInstance().getConnection();
        Statement st = conn.createStatement();
        int cont = 0;
        try{
            ResultSet rs = st.executeQuery("select count * as cont from contato");
            if(rs.next()){   
                cont = rs.getInt("cont");
            }
        }catch(SQLException e){
            System.out.println("Erro no SQL");
        } finally {
            closeResources(conn, st);
        }
        return cont;
    }
    
    public int contarHomenes() throws SQLException, ClassNotFoundException{
        Connection conn = DatabaseLocator.getInstance().getConnection();
        Statement st = conn.createStatement();
        int cont = 0;
        try{
            ResultSet rs = st.executeQuery("select count * as cont from contato where sexo = H");
            if(rs.next()){   
                cont = rs.getInt("cont");
            }
        }catch(SQLException e){
            System.out.println("Erro no SQL");
        } finally {
            closeResources(conn, st);
        }
        return cont;
    }
    
        public int contarMulher() throws SQLException, ClassNotFoundException{
        Connection conn = DatabaseLocator.getInstance().getConnection();
        Statement st = conn.createStatement();
        int cont = 0;
        try{
            ResultSet rs = st.executeQuery("select count * as cont from contato where sexo = M");
            if(rs.next()){   
                cont = rs.getInt("cont");
            }
        }catch(SQLException e){
            System.out.println("Erro no SQL");
        } finally {
            closeResources(conn, st);
        }
        return cont;
    }
        
    public ArrayList<String> findCidade () throws SQLException, ClassNotFoundException{
        Connection conn = DatabaseLocator.getInstance().getConnection();
        Statement st = conn.createStatement();
        ArrayList<String> cidades = new ArrayList();
        try{
            ResultSet rs = st.executeQuery("select distinct cidade from contato");
             while (rs.next()){
                 cidades.add(rs.getString("cidade"));
             }
        }catch(SQLException e){
            System.out.println("Erro no SQL");
        } finally {
            closeResources(conn, st);
        }
        return cidades;
    }
    
    public int totalPorCidade (String cidade) throws SQLException, ClassNotFoundException{
        Connection conn = DatabaseLocator.getInstance().getConnection();
        Statement st = conn.createStatement();
        int cont = 0;
        try{
            ResultSet rs = st.executeQuery("select count * as cont from contato where cidade = " + cidade);
            if(rs.next()){   
                cont = rs.getInt("cont");
            }
        }catch(SQLException e){
            System.out.println("Erro no SQL");
        } finally {
            closeResources(conn, st);
        }
        return cont;
    }
    
    public ArrayList<Integer> mesPorCidade(String cidade) throws SQLException, ClassNotFoundException{
        Connection conn = DatabaseLocator.getInstance().getConnection();
        Statement st = conn.createStatement();
        ArrayList meses = new ArrayList();
        try{
            ResultSet rs = st.executeQuery("select distinct mes from contato where cidade = " + cidade);
            if(rs.next()){
                meses.add(rs.getInt("mes"));
            }
        }catch(SQLException e){
            System.out.println("Erro no SQL");
        } finally {
            closeResources(conn, st);
        }
        return meses;
    }
    
    public int totalPorMes (String cidade, int mes) throws SQLException, ClassNotFoundException{
        Connection conn = DatabaseLocator.getInstance().getConnection();
        Statement st = conn.createStatement();
        int cont = 0;
        try{
            ResultSet rs = st.executeQuery("select count * as cont from contato where cidade = " + cidade + " and mes = " + mes);
            if(rs.next()){
                cont = rs.getInt("cont");
            }
        }catch(SQLException e){
            System.out.println("Erro no SQL");
        } finally {
            closeResources(conn, st);
        }
        return cont;
    }
    
    public int totalHomensPorCidadeMes (String cidade, int mes) throws SQLException, ClassNotFoundException{
        Connection conn = DatabaseLocator.getInstance().getConnection();
        Statement st = conn.createStatement();
        int cont = 0;
        try{
            ResultSet rs = st.executeQuery("select count * as cont from contato where sexo = H and cidade = " + cidade + " and mes = " + mes);
            if(rs.next()){   
                cont = rs.getInt("cont");
            }
        }catch(SQLException e){
            System.out.println("Erro no SQL");
        } finally {
            closeResources(conn, st);
        }
        return cont;
    }
    
    public int totalMulherPorCidadeMes (String cidade, int mes) throws SQLException, ClassNotFoundException{
        Connection conn = DatabaseLocator.getInstance().getConnection();
        Statement st = conn.createStatement();
        int cont = 0;
        try{
            ResultSet rs = st.executeQuery("select count * as cont from contato where sexo = M and cidade = " + cidade + " and mes = " + mes);
            if(rs.next()){   
                cont = rs.getInt("cont");
            }
        }catch(SQLException e){
            System.out.println("Erro no SQL");
        } finally {
            closeResources(conn, st);
        }
        return cont;
    }
    
    public void closeResources(Connection conn, Statement st) {
        try {
            if (st != null) {
                st.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Erro no SQL");
        }
    }
}
