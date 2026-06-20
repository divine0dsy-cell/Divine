import java.sql.*;
import java.util.*;
public class VotingSystemDatabase {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            try {
                Connection con = DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/VotingSystemDatabase1",
                        "postgres",
                        "root123"
                );
                System.out.println("Connected to PostgreSQL");
                System.out.println("Vote for (Raju/Kartik): ");
                String candidate = sc.nextLine();
                String updateQuery =

                        "UPDATE candidate SET votes = votes + 1 WHERE name = ?";
                PreparedStatement pst =
                        con.prepareStatement(updateQuery);
                pst.setString(1, candidate);

                int rows = pst.executeUpdate();

                if (rows > 0) {
                    System.out.println("Vote Recorded!");
                } else {
                    System.out.println("Candidate not found!");
                }
                System.out.println("\nVoting Results:");
                Statement st = con.createStatement();
                ResultSet rs =
                        st.executeQuery("SELECT * FROM candidate");
                while (rs.next()) {

                    System.out.println(
                            rs.getString("name")
                                    + " : "
                                    + rs.getInt("votes")
                    );
                }
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
