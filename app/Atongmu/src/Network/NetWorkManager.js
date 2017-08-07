const get = (url,body){
  return request(url,'GET',body);
}
const request = (url, method, body) => {
  let isOk;
  return new Promise((resolve, reject) => {
    fetch(getUrl(url), {
      method,
      headers: {
        'Content-Type': 'application/json;charset=utf-8'
      },
      body
    })
      .then((response) => {
        if (response.ok) {
          isOk = true;
        } else {
          isOk = false;
        }
        return response.json();
      })
      .then((responseData) => {
        if (isOk) {
          resolve(responseData);
        } else {
          reject(responseData);
        }
      })
      .catch((error) => {
        reject(error);
      });
  });
};
const getUrl = (url){
  return url;
}
