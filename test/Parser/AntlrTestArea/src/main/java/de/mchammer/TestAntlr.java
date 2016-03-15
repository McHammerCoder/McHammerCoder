/*
 * Copyright (c) 2016 RWTH Aachen. All rights reserved.
 *
 * http://www.se-rwth.de/ 
 */
package de.mchammer;


import java.nio.file.Path;
import java.nio.file.Paths;

import org.antlr.runtime.tree.ParseTree;
/**
 * TODO: Write me!
 *
 * @author  (last commit) $Author$
 * @version $Revision$, $Date$
 * @since   TODO: add version number
 *
 */
public class TestAntlr 
{
	public void generateParser(String grammarFile)
	{
		Path path = Paths.get("./out/src/main/java/");
		AntlrTool antlrTool = new AntlrTool(path);
		antlrTool.createParser(grammarFile);
	}
}
