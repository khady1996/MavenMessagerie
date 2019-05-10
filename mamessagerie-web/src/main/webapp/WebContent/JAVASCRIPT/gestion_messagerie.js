
document.getElementById("send").addEventListener("mouseover", mOver);
document.getElementById("send").onmouseout = mOut;
document.getElementById("send").onclick = controle;

function controle() {
	var test = document.formul.user_message.value;
	alert("Vous avez envoyé le message suivant : " + test);
} 

function mOver(){
	document.getElementById("send").style.color = "red";
}

function mOut(){
	document.getElementById("send").style.color = "green";
}
