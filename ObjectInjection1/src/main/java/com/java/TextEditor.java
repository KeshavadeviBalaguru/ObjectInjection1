package com.java;

public class TextEditor {
	
	private SpellCheck spellcheck;

	//getter and setter
	public SpellCheck getSpellcheck() {
		return spellcheck;
	}

	public void setSpellcheck(SpellCheck spellcheck) {
		this.spellcheck = spellcheck;
	}

	//method
	public void texteditor_function()
	{ 
		if(spellcheck!=null) {
		SpellCheck.spellcheck_Function();
		}
		else
		{
			System.out.println("Spellcheck is disable");
		}
	}

	/*public TextEditor(SpellCheck spellcheck) {
		super();
		this.spellcheck = spellcheck;
	}*/
	
	
	

}
