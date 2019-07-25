package com.hextrato.kral.console.exec.meta.tabular;

import com.hextrato.kral.console.parser.KCMetadata;
import com.hextrato.kral.console.parser.KCParser;
import com.hextrato.kral.core.util.exception.KException;

public class AttributeDesc implements KCParser {

	public boolean exec(KCMetadata clmd) throws KException {
		return Attribute.doDesc(clmd);
	}
}

