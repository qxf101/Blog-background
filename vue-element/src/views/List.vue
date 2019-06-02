<template>
  <el-table :data="articles">
    <el-table-column prop="createTime" label="文章日期" width="140"></el-table-column>
    <el-table-column prop="blogName" label="文章名称" width="120"></el-table-column>
    <el-table-column prop="author" label="文章作者" width="120"></el-table-column>
    <el-table-column prop="blogContext" label="文章内容"></el-table-column>
    <el-table-column
      fixed="right"
      label="操作"
      width="100">
      <template slot-scope="scope">
        <el-button @click="edit(scope.row.id)" type="text" size="small">编辑</el-button>
        <el-button @click="remove(scope.row.id)" type="text" size="small">删除</el-button>
      </template>
    </el-table-column>
  </el-table>
</template>

<script>
export default {
  data() {
    return {
      articles: []
    };
  },
  methods:{
    fetchData(){
      this.$http.post('/selectBlog').then(res => {
        this.articles = res.data
      })
    },
    edit(id){
      this.$router.push(`/edit/${id}`)
    },
    remove(id){
      this.$http.post('/delBlog',{id: id}).then(res => {
        this.$message({
          showClose: true,
          message: '文章删除成功',
          type: 'success'
        });
        this.fetchData();
      })
    }
  },
  created(){
      this.fetchData();
  },
};
</script>