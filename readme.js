const fs=require('fs');
const exclude=['.git','.github','README.md','package.json','readme.js'];
const ROOT_DIR = './';
const index = [];


// REMOTE CONFIGs
const GITHUB_USERNAME = 'SAHIL250499';
const GITHUB_REPO_NAME = 'Java-Programs-Learning-DSA-in-java';
const GITHUB_BRANCH_NAME = 'main';
const GITHUB_REPO_URL = 'https://github.com/' + GITHUB_USERNAME + '/' + GITHUB_REPO_NAME;
const GITHUB_REPO_BLOB_URL = GITHUB_REPO_URL + '/blob/' + GITHUB_BRANCH_NAME+'/';

let count = 0;
let easy = 0, medium = 0, hard = 0;

const getDirectories = (path, exclude = []) => {
  if (exclude)
    return fs.readdirSync(path).filter((item) => !exclude.includes(item));
  else return fs.readdirSync(path);
};

const catDirArray = getDirectories(ROOT_DIR, exclude);
let content="";

for(let i=0;i<catDirArray.length;i++){
  const item=catDirArray[i];
  content+=`### [${item}](${GITHUB_REPO_BLOB_URL}${item})\n`
  content+="\n\n----\n";
}


fs.writeFileSync('README.md', content);
