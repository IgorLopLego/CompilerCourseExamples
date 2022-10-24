/*
 * 13.09.2016 Minor edit
 * 11.10.2010 dump() removed
 * 21.10.2009 New folder structure
 * 01.10.2006 Original version
 */
 
package dk.via.jpe.intlang.intlangAbstractSyntaxTrees.ast;


public class CallExpression
	extends Expression
{
	public Identifier name;
	public ExpList args;
	
	
	public CallExpression(Identifier name, ExpList args )
	{
		this.name = name;
		this.args = args;
	}
}