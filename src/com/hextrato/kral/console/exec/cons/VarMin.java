package com.hextrato.kral.console.exec.cons;

import com.hextrato.kral.console.parser.KCMetadata;
import com.hextrato.kral.console.parser.KCParser;
import com.hextrato.kral.core.util.exception.KException;

public class VarMin implements KCParser {

	public void setContext (KCMetadata clmd) { clmd.setContext("value"); }

	public boolean exec(KCMetadata clmd) throws KException {
		return Var.doMin(clmd); 
	}
}
