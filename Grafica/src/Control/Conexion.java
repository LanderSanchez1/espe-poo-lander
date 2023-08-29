package Control;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.sql.Connection;
import java.sql.ResultSet;
import org.bson.Document;
public class Conexion {
    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> collection;

    public Conexion() {
        // Conexión a la base de datos MongoDB
        mongoClient = MongoClients.create("mongodb://localhost:27017");
        database = mongoClient.getDatabase("testdb");  // Cambia "testdb" al nombre de tu base de datos
        collection = database.getCollection("items"); // Cambia "items" al nombre de tu colección
    }

    public void cerrarConexion() {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }

    public void insertarRegistro(Document documento) {
        collection.insertOne(documento);
    }
    
    public void actualizarRegistro(String codigo, Document nuevoDocumento) {
        Document filtro = new Document("codigo", codigo);
        collection.updateOne(filtro, new Document("$set", nuevoDocumento));
    }
    
    public void eliminarRegistro(String codigo) {
        Document filtro = new Document("codigo", codigo);
        collection.deleteOne(filtro);
    }

    public Object getCollection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   
    
    }
     public MongoCollection<Document> getMongoCollection() {
        try {
            MongoClient client = MongoClients.create("mongodb://localhost:27017");
            MongoDatabase database = client.getDatabase("testdb");
            return database.getCollection("items");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ResultSet obtenerDatosProfesores() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void cerrarConexion(Connection conexion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Connection conexion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}




