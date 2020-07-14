https://git-scm.com/docs/git

### create gitignore
    touch .gitignore

# Git Command
### add
    
### clone :
    git clone [path] [name] : path의 파일들을 name 이름의 폴더에 복사해옴
    git clone -b [branchName] [path] [name] : path의 파일들 중 branchName 에 해당하는 특정 브랜치를 복사해옴 

### revert : 
### reset : 
    add 일 경우 : git reset
    commit 일 경우 : git reset [options] HEAD^ - 첫번째 commit 삭제
                    git reset [options] HEAD~3 - 세번째 commit 삭제
                    
    [options] : --soft : Head( commit 후 staging 되는 곳 ) 의 파일을 변경 (가리키는(주소인듯) 파일을 변경)
                --mixed (default) : soft + index( add 후 staging 되는 곳 ) 의 파일을 변경
                --hard : soft + index + working directory( 현재 작업하는 곳) 의 파일을 변경 

### reflog : 
    git reflog : HEAD 변경 이력을 보여줌 ( reset 했을 경우 )
                 e.g )
                 3f6db14 HEAD@{0}: HEAD~: updating HEAD 
                 d27924e HEAD@{1}: checkout: moving from d27924e0fe16776f0d0f1ee2933a0334a4787b4c 
                 57e53a0 HEAD@{2}: modify : bug 수정
                 이런식으로 나올 때 
                 git reset --hard HEAD@{1} 
                 명령어를 통해 HEAD를 변경시킬수 있음

### stash : ★보충
    git stash : 아직 마무리하지 않은 작업을 스택에 잠시 저장
    git stash save : 위와 동일
    git stash list : stash 목록 확인하기
    git stash apply : 가장 최근의 stash 가져와 적용
    git stash apply [name] : 이름에 해당하는 stash 가져와 적용
    git stash drop : 가장 최근의 stash 를 제거
    git stash drop [name] : 이름에 해당하는 stash 를 제거
    git stash show -p : 가장 최근의 stash 를 사용하여 패치를 만들고 거꾸로 적용
    git apply -R : 위와 동일
    git stash show -p [name] : 이름에 해당하는 stash 를 사용하여 패치를 만들고 거꾸로 적용

### branch :
    git branch : 브랜치 목록 보여줌
    git branch [name] : 브랜치 생성
    git branch -m [replaceName] [newName] : 로컬에서 브랜치 이름 변경
    git branch --delete [name] : 로컬에서 브랜치 삭제
    git push origin :[removeBranchName] : 원격 저장소 해당 브랜치 삭제

### config :
    git config --list : 설정 리스트 보여줌
    git config --global core.editor [editor] : 사용할 텍스트 편집기 고름
    git config [options] core.editor [editor] : 사용할 텍스트 편집기 고름
    git config user.name : 현재 사용자 이름 확인
    git config user.email : 현재 사용자 이메일 확인
    git config --global user.name [username] : 현재 사용자 이름 변경
    git config --global user.email [email] : 현재 사용자 이메일 변경

    git config [options] user.name [username] : 현재 사용자 이름 변경
    git config [options] user.email [email] : 현재 사용자 이메일 변경

    [options] : --global : 전체
                --local : 현재폴더만
                --system : etc/gitconfig 파일(시스템의 모든 사용자와 모든 저장소에 적용되는 설정) 수정
                --worktree : add, update configuration in this file ?
### checkout :
    git checkout -p [branch] [file] : branch의 file만 가져와서 패치함
    git checkout HEAD~N : N번 전의 commit 내역으로 새로운 브랜치 생성하여 코드 반환
    git checkout 8553f : 8553f의 commit 내역으로 새로운 브랜치 생성하여 코드 반환
### common options

###### -v, --verbose    : 상세하게 보여줌 
###### -f, --force      : 강제로 넣어줌 ( e.g : git ignore 에 있는 파일 )
###### -i, --interactive : 대화형으로 보여줌 (탈출방법 : Ctrl + D)
