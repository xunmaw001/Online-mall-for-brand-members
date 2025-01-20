const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm96php/",
            name: "ssm96php",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm96php/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "面向品牌会员的在线商城"
        } 
    }
}
export default base
