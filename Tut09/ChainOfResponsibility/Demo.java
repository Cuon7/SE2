package Tut09.ChainOfResponsibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Tut09.ChainOfResponsibility.middleware.Middleware;
import Tut09.ChainOfResponsibility.middleware.RoleCheckMiddleware;
import Tut09.ChainOfResponsibility.middleware.ThrottlingMiddleware;
import Tut09.ChainOfResponsibility.middleware.UserExistsMiddleware;
import Tut09.ChainOfResponsibility.server.Server;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        //TO-DO: Register email & pass for 2 account types: admin & user
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // All checks are linked. Client can build various chains using the same components.
        Middleware middleware = new ThrottlingMiddleware(2);
        middleware.linkWith(new UserExistsMiddleware(server))
                .linkWith(new RoleCheckMiddleware());

        // Server gets a chain from client code.
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
        	//TO-DO: Ask for email & password then save to suitable variables

        	//TO-DO: Try to login to server with given email & password
        	//then store the result to variable 'success'
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);            
        } while (!success);
    }
}
