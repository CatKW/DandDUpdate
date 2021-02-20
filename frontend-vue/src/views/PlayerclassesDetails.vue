<template>
    <div>
        <span>{{playerclass.name}}</span>

        <iframe width="560" height="315" :src="playerclass.url" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
    </div>

</template>

<script>
export default {
    data: () => ({
        playerclass: "",
    }),
    async mounted(){
        const{data} = await this.$http.get('http://localhost:8080/api/playerclass/' + this.$router.params.id);
        this.playerclass = data;
    }
}
</script>