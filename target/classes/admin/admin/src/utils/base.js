const base = {
    get() {
        return {
            url : "http://localhost:8080/xinxijishuzhishisai/",
            name: "xinxijishuzhishisai",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xinxijishuzhishisai/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "信息技术知识赛系统"
        } 
    }
}
export default base
