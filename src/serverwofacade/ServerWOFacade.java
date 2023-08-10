/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serverwofacade;

public class ServerWOFacade {
	public static void main(String[] args) {
		ScheduleServer scheduleServer = new ScheduleServer();

		ServerFacade facade = new ServerFacade(scheduleServer);

		// Start the server
		facade.startServer();

		// Simulate some work...

		// Stop the server
		facade.stopServer();
	}
}
