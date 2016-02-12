/**
 * 
 */
function validarPasswd(){
	var p1 = document.getElementById("f_password1").value;
	var p2 = document.getElementById("f_password2").value;
	var espacios = false;
	var cont = 0;
	while (!espacios && (cont < p1.length)) {
	  if (p1.charAt(cont) == " ")
	    espacios = true;
	  cont++;
	}
	if (espacios) {
	  alert ("La contraseña no puede contener espacios en blanco");
	  return false;
	}
	if (p1.length == 0 || p2.length == 0) {
		  alert("Los campos de la password no pueden quedar vacios");
		  return false;
	}
	if (p1 != p2) {
		  alert("Las passwords deben de coincidir");
		  return false;
	} else {
		alert("Las contrasenas están correctas");
		return true; 
		}
}
