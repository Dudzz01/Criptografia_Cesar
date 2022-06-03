  
public class Criptografia {
    private char[] palavra_alfabeto = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	private char[] letras;
	
	public void encryptar(String plvr_encrypt) {
		// Looping ForEach que basicamente usa 
		letras = plvr_encrypt.toCharArray();
		for(int i = 0; i<letras.length;i++)
		{
			for(int j = 0; j<palavra_alfabeto.length;j++)
			{
				    
				
				
				  if(letras[i] == palavra_alfabeto[j])
				  {
					  if(letras[i] == 'x')
					  {
						 letras[i] = 'a';
						 
					  }
					  else if(letras[i] == 'y')
					  {
						 letras[i] = 'b';
						 
					  }
					  else if(letras[i] == 'z')
					  {
						  letras[i] = 'c';
						  
					  }
					  else
					  {
					  letras[i] = palavra_alfabeto[j+3];
					  break;
					  }
				  }
			}
		}
		
		System.out.print(letras);
	}
	
	public void decryptar(String plvr_decrypt) {
		letras = plvr_decrypt.toCharArray();
		for(int i = 0; i<letras.length;i++)
		{
			for(int j = 0; j<palavra_alfabeto.length;j++)
			{
				  if(letras[i] == palavra_alfabeto[j])
				  {
					  if(letras[i] == 'a')
					  {
						 letras[i] = 'x';
						 break;
					  }
					  else if(letras[i] == 'b')
					  {
						 letras[i] = 'y';
						 break;
					  }
					  else if(letras[i] == 'c')
					  {
						  letras[i] = 'z';
						  break;
					  }
					  else
					  {
						  letras[i] = palavra_alfabeto[j-3];
						  break;
					  }
					  
					  
				  }
			}
		}
		System.out.println("");
		System.out.print(letras);
	}
	
}
