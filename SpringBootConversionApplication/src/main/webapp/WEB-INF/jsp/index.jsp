<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SpringBoot Conversion Application</title>
<style>
 #form{
       width:50%;
       margin-left:auto;
       margin-right:auto;
       }
        legend{
       text-align:center;
       font-size:30px;
       }
        p{
         text-align:center;
         }
         #yeah{
margin-bottom:10px;
}
legend {
    background-color: #000;
    color: #fff;
    padding: 3px 6px;
}

.output {
    font: 1rem 'Fira Sans', sans-serif;
}

input,
label {
    width: 50%;
}

input {
    margin: .5rem 0;
    padding: .5rem;
    border-radius: 4px;
    border: 1px solid #ddd;
}

label {
    display: inline-block;
    font-size: .8rem;
}

input:invalid + span:after {
    content: '✖';
    color: #f00;
    padding-left: 5px;
}

input:valid + span:after {
    content: '✓';
    color: #26b72b;
    padding-left: 5px;
}

.warning {
    font-size: .65rem;
    color: #e67d09;
}

.submit {
    width: 100%;
    margin: 0 auto;
}

</style>
</head>
<body>

		  <form id="form" action="/index.html" method="post">
			  <fieldset>
			 <legend>Spring Boot Conversion Application</legend>
             <br>
             <legend>Length Conversions</legend>
             	 <br>
	             <form id="yeah">
	             <table border="0">
	               <tr>
				    <td><label for="centimeter">From:</label></td>
				   <td>
				   <select id="From-select" name="From-select">
						       <option value="">--Please choose an option--</option>
						    <option value="millimetres/mm">millimetres/mm</option>
						    <option value="centimetres/cm">centimetres/cm</option>
						    <option value="metres/m">metres/m</option>
						    <option value="kilometres/km">kilometres/km</option>
						    <option value="Inch">Inch</option>
						    <option value="Foot">Foot</option>
						    <option value="Yard">Yard</option>
						    <option value="Mile">Mile</option>
						  
						</select></td>
				   </tr>
				    
				   <tr>
				    <td><label for="meter">To:</label></td>
				    <td><select id="To-select" name="To-select">
						    <option value="">--Please choose an option--</option>
						    <option value="millimetres/mm">millimetres/mm</option>
						    <option value="centimetres/cm">centimetres/cm</option>
						    <option value="metres/m">metres/m</option>
						    <option value="kilometres/km">kilometres/km</option>
						    <option value="Inch">Inch</option>
						    <option value="Foot">Foot</option>
						    <option value="Yard">Yard</option>
						    <option value="Mile">Mile</option>
						   
						</select></td>
				    </tr>
				  
				 
				  <tr>
				    <div>
			            <td><label for="display-name"> Amount to Convert:
			                <span class="warning">*(Allows only Numbers.)</span> 
			            </label></td>
			            <td><input type="text" id="display-name" name="input"
			                    pattern="[0-9]+([\.,][0-9]+)?" step="0.01"
			                   maxlength="20" minlength="1" value="0" required />
			          </td>
			        </div>
				     </tr>
				  <tr>
				    <div>
			           <td> <label for="Result">Result:</label></td>
			            <td> <input type="text" id="Result" name="Result"
			                   placeholder="0.00" readonly value=" " /></td>
			        </div>
				   </tr>
				   
				  
					<tr>
						<td>
					      <input type="submit" class="bottom" name="usersubmit" value="Convert Length">
					    </td>
				    </tr>
				   </table>
				  </form>
				  <br>
				  <legend>Temperature Conversions</legend>
				  <br>
	             <table border="0">
	               <tr>
				    <td><label for="centimeter">From:</label></td>
				   <td>
				   <select id="From-select" name="From-selectTemp">
						       <option value="">--Please choose an option--</option>
								<option value="celsius/tC">celsius/tC</option>
							    <option value="fahrnheit/tF">fahrnheit/tF</option>
						  
						</select></td>
				   </tr>
				    
				   <tr>
				    <td><label for="meter">To:</label></td>
				    <td><select id="To-select" name="To-selectTemp">
						    <option value="">--Please choose an option--</option>
						    <option value="celsius/tC">celsius/tC</option>
							<option value="fahrnheit/tF">fahrnheit/tF</option>
						   
						</select></td>
				    </tr>
				  
				 
				  <tr>
				    <div>
			            <td><label for="display-name"> Amount to Convert:
			                <span class="warning">*(Allows only Numbers.)</span> 
			            </label></td>
			            <td><input type="text" id="display-name" name="inputTemp"
			                    pattern="[0-9]+([\.,][0-9]+)?" step="0.01"
			                   maxlength="20" minlength="1" value="0" required />
			          </td>
			        </div>
				     </tr>
				  <tr>
				    <div>
			           <td> <label for="Result">Result:</label></td>
			            <td> <input type="text" id="Result" name="ResultTemp"
			                   placeholder="0.00" readonly value=" " /></td>
			        </div>
				   </tr>
				   
				  
					<tr>
						<td>
					      <input type="submit" class="bottom" name="usersubmit" value="Convert Temperature">
					    </td>
				    </tr>
				  
				   </table>
				  <br>
				  <legend>Mass Conversions</legend>
				  <br>
	             <table border="0">
	               <tr>
				    <td><label for="centimeter">From:</label></td>
				   <td>
				   <select id="From-select" name="From-selectMass">
						       <option value="">--Please choose an option--</option>
							    <option value="grammes/g">grammes/g</option>
							    <option value="kilogrammes/kg">kilogrammes/kg</option>
							    <option value="metric tonnes/mT">metric tonnes/mT</option>
							    <option value="Ounce">Ounce</option>
							    <option value="Pound">Pound</option>
							    <option value="Stone">Stone</option>
							    <option value="Long ton">Long ton</option>
						    
						  
						</select></td>
				   </tr>
				    
				   <tr>
				    <td><label for="meter">To:</label></td>
				    <td><select id="To-select" name="To-selectMass">
						    <option value="">--Please choose an option--</option>
						    <option value="grammes/g">grammes/g</option>
						    <option value="kilogrammes/kg">kilogrammes/kg</option>
						    <option value="metric tonnes/mT">metric tonnes/mT</option>
						    <option value="Ounce">Ounce</option>
						    <option value="Pound">Pound</option>
						    <option value="Stone">Stone</option>
						    <option value="Long ton">Long ton</option>
						</select></td>
				    </tr>
				  
				 
				  <tr>
				    <div>
			            <td><label for="display-name"> Amount to Convert:
			                <span class="warning">*(Allows only Numbers.)</span> 
			            </label></td>
			            <td><input type="text" id="display-name" name="inputMass"
			                    pattern="[0-9]+([\.,][0-9]+)?" step="0.01"
			                   maxlength="20" minlength="1" value="0" required />
			          </td>
			        </div>
				     </tr>
				  <tr>
				    <div>
			           <td> <label for="Result">Result:</label></td>
			            <td> <input type="text" id="Result" name="ResultMass"
			                   placeholder="0.00" readonly value=" " /></td>
			        </div>
				   </tr>
				   
				  
					<tr>
						<td>
					      <input type="submit" class="bottom" name="usersubmit" value="Convert Mass">
					    </td>
				    </tr>
				  
				   </table>
		
		  </fieldset>
		
		</form>



</body>
</html>