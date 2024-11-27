# Git

## 0 简介

（最终绝不修改版.jpg）

版本控制工具

- 集中式代表：SVN
- 分布式代表：Git、mercurial

安装：[Releases · git-for-windows/git (github.com)](https://github.com/git-for-windows/git/releases)

Git 仓库中的提交记录保存的是你的目录下所有文件的快照，就像是把整个目录复制，然后再粘贴一样，但比复制粘贴优雅许多！Git 希望提交记录尽可能地轻量，因此在你每次进行提交时，它并不会盲目地复制整个目录。条件允许的情况下，它会将当前版本与仓库中的上一个版本进行对比，**并把所有的差异**打包到一起作为一个提交记录。Git 还保存了提交的历史记录。这也是为什么大多数提交记录的上面都有 parent 节点的原因 —— 我们会在图示中用箭头来表示这种关系。对于项目组的成员来说，维护提交历史对大家都有好处。

### 基础知识

文件区域

- 工作区：.git所在目录，就是资源管理器中世纪的目录
- 暂存区：.git/index，用于临时存放你的改动，通过git add暂存工作区修改后的文件
- 本地仓库：.git/objects，包含完整的项目里是和元数据，是git存储代码和版本的主要位置
- 远程仓库

⽂件状态

- 已修改（Modified）修改了但是没有保存到暂存区的⽂件 
- 已暂存（Staged） 修改后已经保存到暂存区的⽂件 
- 已提交（Committed）把暂存区的⽂件提交到本地仓库后的状态

### 常用Linux命令

```
cd [src]			// 改变目录
cd ..				// 返回上一级
pwd					// 显示当前路径
clear				// 清屏
ls					// 显示当前路径下所有文件
ls -ltr				// 显示当前路径下所有文件，并显示详细信息
touch [fileName]	// 在当前目录下新建一个文件
echo "content" > [dir/fileName]			// 在当前目录下新建\打开一个文件，并写入content内容
echo "content" >> [dir/fileName]		// 在当前目录下打开一个文件，并在末尾追加写入content内容
cat [fileName]		// 查看文件内容
mkdir [foldName]	// 在当前目录下创造新目录\新建一个文件夹
rm [fileName]		// 移除当前目录下的文件
rm -r [foldName]	// 移除当前目录下的文件夹
mv [fileName] [src]	// 移动文件
help
history
exit
```





## 配置命令

配置用户名邮箱

```
git config --global user.name [用户名称]
git config --global user.email [用户邮箱]
```

其中`--global`处

- 若省略则为本地，只对本地仓库有效
- --global，全局配置，对所有仓库有效
- --system，系统配置，对所有用户有效，一般不使用

保存配置

```
git config --global credential.helper store
```

查看配置

```
git config --global --list
```

## 检查

**检查仓库**

```
// 查看状态
git status
// 查看提交日志
git log
git log --oneline
git log --gragh --oneline --decorate --all
// 查看暂存区文件
git ls-files

```



查看修改内容

```
git diff			// 比较工作区和暂存区之间的差异
git diff HEAD 		// 比较工作区和版本库之间的差异
git diff --cached	// 比较暂存区和版本库之间的差异

git diff [id1] [id2] 	// 比较两个版本\分支之间的差异
git diff HEAD^ HEAD
git diff HEAD~2 HEAD

git diff [id1] [id2] [fileName] 	// 比较某个文件在两个版本之间的差异
```







## 添加与提交

一图流

![1](.\img\1.png)

### 创建

创建⼀个新的本地仓库，省略project-name则在当前⽬录创建 ，创建完成后目录中会生成.git文件

```
git init <project-name>
```

克隆⼀个远程仓库（在命令行中使用 shift+ins 进行粘贴操作）

```
git clone <url>
```

### 操作

在进入仓库目录后

创建file.txt文件并查看，得到结果

```
/learn-git (master)
$ git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        file.txt

nothing added to commit but untracked files present (use "git add" to track)
```

**添加至暂存区**

```
git add <file>		// 添加指定文件
git add .			// 添加目录下所有文件
git add *.txt		// 添加目录下指定拓展名文件

git rm <fileName>	// 删除工作区和暂存区中文件
rm <fileName>		// 删除工作区中文件
```

结果

```
/learn-git (master)
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   file.txt
```

**提交暂存区文件至仓库**

```
git commit -m "message"
git commit -am "message"	// 更新暂存区中的修改并提交
```

得到结果并检查日志

```
/learn-git (master)
$ git commit -m "first commit"
[master (root-commit) 2ad4b83] first commit
 1 file changed, 1 insertion(+)
 create mode 100644 file.txt
 
/learn-git (master)
$ git log
commit 2ad4b839d2eab36acb3b2a646a89b4133dcf2af0 (HEAD -> master)
Author: L7WD3_Xiao <2461234298@qq.com>
Date:   Sat Oct 5 11:11:26 2024 +0800

    first commit
```

## 分支与合并

使用分支可方便协作，每个开发人员可在自己的分支上进行操作，也可用于新功能开发与bug修复，可让主线仓库处于随时可用于较为稳定的状态。保证项目运行与高效协作。

原则：早建分支！多用分支！

- 这是因为即使创建再多的分支也不会造成储存或内存上的开销，并且按逻辑分解工作到不同的分支要比维护那些特别臃肿的分支简单多了。

### 操作

**创建**并转到分支

```
git branch [branch-name]
git checkout [branch-name]
```

也可以使用以下命令同时完成上面两步操作

```
git checkout -b [branch-name]
```

注意：git checkout 命令同时也是恢复文件命令，若分支名与文件名相同，则会优先切换分支。在 git v2.23之后的版本，新增 git switch 命令专门用来切换分支

**合并**

将当前分支与目标分支合并，并将当前分支指向合并后的分支

```
git merge [objective-branch-name]
```

将当前分支的复制（复制内容为当前分支到当前分支与目标分支共同祖先）接到目标分支后，并将当前分支指向合并后的分支

```
git rebase [objective-branch-name]
```

**删除分支**

```
// 删除已经合并的分支
git branch -d [branch-name]
// 删除分支，无论有无合并
git branch -D [branch-name]
```







## 撤销

**reset方法**：仅对本地有效，将指针回退到上一次提交

```
git reset [欲回退到的地址 / 相对地址]
// 回退到上一次提交
git reset HEAD^
```

注意，在reset后， 被撤销提交所做的变更还在，但是处于未加入暂存区状态。仍可以通过访问直接地址的方式访问 git checkout [hash address]

reset 参数

```
git reset -soft		// 回退时保留当前工作区和暂存区状态
git reset -hard		// 回退时重置当前工作区和暂存区为回退版本
git reset -mixed	// 回退时保留当前工作区状态，重置暂存区状态为回退版本
```

<img src=".\img\3.png" alt="3" style="zoom:40%;" />



**revert方法**：能将撤销更改**分享**给别人，将会产生一个新提交，通过提交更改实现撤销效果（注意：此处的新提交会以目前的 HEAD 位置为基准进行提交）

```
git revert [欲撤销的提交]
// 回退到上一次提交
git revert HEAD
```









## 远程仓库

![2](.\img\2.png)

### SSH配置

在root用户根目录下

```
mkdir .ssh		// 创建.ssh目录
cd .ssh
ssh-keygen -t rsa -b 4096		// 生成ssh密钥
```

生成完成后使用 ls 命令查看目录下文件

```
$ ls
id_rsa  id_rsa.pub
```

其中 id_rsa 为私钥，id_rsa.pub 为公钥文件



## 忽略文件

哪些需要忽略

- 日志文件
- 编译产生的中间文件，例如 .class .o
- 涉及敏感信息的文件



在仓库目录配置 .gitignore 文件，可配置哪些文件无需版本控制

```
# 使用sharp符号注释
*.txt		# 忽略所有拓展名为txt的文件
!lib.txt	# 但不包括lib.txt
/doc		# 仅检查doc文件夹之前的进行忽略，不忽略doc文件夹
tmp/		# 忽略tmp目录下所有
```

