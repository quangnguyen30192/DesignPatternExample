package com.quangbnn.pattern.structural.proxy;

public class CommandExecutorProxy implements CommandExecutor {
	
	private boolean isAdmin;
	private CommandExecutor executor;
	
	public CommandExecutorProxy(String username, String password) {
		if("Quang".equalsIgnoreCase(username)
				&& "123".equalsIgnoreCase(password)) {
			isAdmin = true;
		}
		
		executor = new CommandExecutorImpl();
	}
	
	@Override
	public void runCommand(String cmd) throws Exception {
		if(isAdmin) {
			executor.runCommand(cmd);
		} else {
			if(cmd.trim().startsWith("rm")) {
				throw new Exception("rm command is not allowed for nonadmin users.");
			} else {
				executor.runCommand(cmd);
			}
		}
	}
}