const base = {
    get() {
                return {
            url : "http://localhost:8080/springboot58ly4/",
            name: "springboot58ly4",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot58ly4/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "考研资讯平台"
        } 
    }
}
export default base
