package com.quangbnn.pattern.structural.proxy;

public class CommandExecutorImpl implements CommandExecutor {
	@Override
	public void runCommand(String cmd) throws Exception {
		Runtime.getRuntime().exec(cmd);
		System.out.println(String.format("'%s' is executed", cmd));
	}
}