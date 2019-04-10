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

public class LinearSearchBasic extends GhidraScript {

    public void run() throws Exception {
	Listing listing = currentProgram.getListing(); //get a Listing interface
	InstructionIterator ins_list = listing.getInstructions(true); //get an Instruction iterator
	Instruction ins;
	Integer counter = 0;
	String test = "-------------------------------------";
	while(ins_list.hasNext()){             //go through each instruction and print it out to the console
   		ins = ins_list.next();
    		println(counter.toString()+" "+ins.getMnemonicString()+" "+ ins.getDefaultOperandRepresentation​(0));
		println(test);
		counter++;
		//print(ins); doesn't works
		// println(ins); doesn't works
	}
    }

}
