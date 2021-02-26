<template>
    <div>
        <span class="creatures">{{creature.name}}</span>
         
         <iframe class="video" width="560" height="315" :src="creature.video" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
    </div>

</template>

<script>
export default {
    data: () => ({
        creature: ""
    }),
    async mounted() {
        const {data} = await this.$http.get('http://localhost:8080/api/creature/' + this.$route.params.id);
        this.creature = data;
    }
}
</script>

<style scoped>
.creatures {
    display: block;
    margin-left: 50%;
    margin-right: auto;
    margin-bottom: 2%;
    font-weight: bold;
}

.video {
    display: block;
    margin-left: 30%;
}
</style>