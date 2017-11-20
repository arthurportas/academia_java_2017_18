package Persistence;

import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class DBConnectorTest {

    @Test
    public void TestConnection() throws SQLException {

        DBConnector testcon = DBConnector.getConnection();

        assertNotNull(testcon);

    }

}