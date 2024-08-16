const baseEndpoint = 'https://api.github.com';
const usersEndpoint = `${baseEndpoint}/users`;
//se cambia query selector por className.
const $n = document.getElementsByClassName('name');
//El ID de blog estaba mál escito. se corrige ese error
const $b = document.getElementsByClassName('blog');
const $l = document.getElementsByClassName('.location');
//se agrega async a la función para que funcione el await
async function displayUser(username) {
  $n.innerHTML = 'cargando...';
  try{ 
  const response = await fetch(`${usersEndpoint}/${username}`);
  //data  toma los datos de response
  const data = response.json();
  console.log(data);
  $n.innerHTML = '${data.name}';
  $b.innerHTML = '${data.blog}';
  $l.innerHTML = '${data.location}';
} catch(error){
  handleError(error);
}
} 
function handleError(error) {
  console.log('OH NO!');
  console.log(error);
  $n.innerHTML = `Algo salió mal: ${error}`
}

displayUser('stolinski');