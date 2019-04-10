//TODO write a description for this script
//@author 
//@category _NEW_
//@keybinding 
//@menupath 
//@toolbar 
import java.lang.*;
import ghidra.app.script.GhidraScript;
import ghidra.program.model.util.*;
import ghidra.program.model.reloc.*;
import ghidra.program.model.data.*;
import ghidra.program.model.block.*;
import ghidra.program.model.symbol.*;
import ghidra.program.model.scalar.*;
import ghidra.program.model.mem.*;
import ghidra.program.model.listing.*;
import ghidra.program.model.lang.*;
import ghidra.program.model.pcode.*;
import ghidra.program.model.address.*;
import ghidra.program.flatapi.*;

public class DeveFunzionare extends GhidraScript {

public void run() throws Exception {
	

	
	Listing listing = currentProgram.getListing();
	
	InstructionIterator inslist = listing.getInstructions(true);
	
	Instruction ins;
	
	while(inslist.hasNext()) {
		ins = inslist.next();
		Object[] ops = ins.getOpObjects(0);
	try {
		Address target_addr = ops[0];
		Function sink_func = listing.getFunctionAt(target_addr);
		String sink_func_name = sink_func.getName();
		println(sink_func_name);
	} catch (Exception e) {
		
	}
		
		
	}
	
}

}