<template>
    <div>
        <h1 class="title">Add Your Player!</h1>

        <div class="field">
            <label class="label" for="playerName">Player Name</label>
            <div class="controller">
                <input id="playerName" class="input" type="text" v-model="player.playerName" placeholder="Your Name Here"/>
            </div>
        </div>

        <div class="field">
            <label class="label" for="characterName">Character Name</label>
            <div class="controller">
                <input id="characterName" class="input" type="text" v-model="player.characterName" placeholder="Your Character Name Here"/>
            </div>
        </div>
        

        <div class="field">
            <label class="label">Race</label>
            <div class="select">
                <select v-model="player.races">
                    <option v-for="race in races" :value="race" :key="race.id">
                        {{race.name}}
                    </option>
                </select>
            </div>
        </div>
        
        <div class="field">
            <label class="label">Class</label>
            <div class="select">
                <select v-model="player.creatures">
                    <option v-for="creature in creatures" :value="creature" :key="creature.id">
                        {{creature.name}}
                    </option>
                </select>
            </div>
        </div>
        <div class="field"> 
            <label class="label">Alignment</label>
            <div class="select">
                <select v-model="player.alignment.id">
                    <option v-for="alignment in alignments" :value="alignment.id" :key="alignment.id">
                        {{alignment.name}}
                    </option>
                </select>
            </div>
        </div>

        <div class="field">
           <label class="label">Weapon</label>
           <div class="control" v-for="weapon in weapons" :key="weapon.id">
               <label :for="weapon.id" class="radio">
                   <input type="radio" :id="weapon.id" :value="weapon" v-model="player.weapons" class="radio"/>
                   {{weapon.name}}
               </label>
           </div>
        </div>

        <div class="field">
            <label class="label">Armor</label>
            <div class="control" v-for="armor in armors" :key="armor.id">
                <label :for="armor.id" class="radio">
                    <input type="radio" :id="armor.id" :value="armor" v-model="player.armors" class="radio"/>
                    {{armor.name}}
                </label>
            </div>
        </div>
 

        

         

        <div class="field is-grouped">
            <div class="control">
                <button @click="cancel" class="button">Cancel</button>
            </div>
            <div class="control">
                <button @click="save" class="button is-primary">Save</button>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    name: "AddPlayer",
    data: () => ({
        player: {
            playerName: null,
            characterName: null,
            alignment: {},
            creature:{},
            weapon:{},
            armor: {},
            race: {}
        
        },
        alignments: [],
        creatures: [], 
        weapons:[], 
        armors: [],
        races: []
       
    }),
    methods: {
        async save () {
            console.log('AddPlayer.save() player=', this.player)
            const response = await this.$http.post('http://localhost:8080/api/players/', this.player);
            console.log('AddPlayer.save() response=', response);
            this.$router.push({path: '/players'})
        },
        cancel() {
            this.$router.push({path: '/players'})
        },
        async getAlignments() {
            const {data} = await this.$http.get('http://localhost:8080/api/alignment');
            console.log('getAlignments() data', data)
            return data;
        },
        async getCreatures() {
            const {data} = await this.$http.get('http://localhost:8080/api/creature');
            console.log('getCreatures() data', data)
            return data;
        },
        async getWeapons() {
            const {data} = await this.$http.get('http://localhost:8080/api/weapons');
            console.log('getWeapons() data', data)
            return data;
        },
        async getArmors() {
            const {data} = await this.$http.get('http://localhost:8080/api/armor');
            console.log('getArmors() data', data)
            return data;
        },
        async getRaces() {
            const {data} = await this.$http.get('http://localhost:8080/api/races');
            console.log('getRaces() data', data)
            return data;
        },
        async getPlayers() {
            const {data} = await this.$http.get('http://loclahost:8080/api/players');
            console.log('getPlayers() data', data)
            return data;
        },
     
    
        
       
    }, 
    async mounted() {
        this.alignments = await this.getAlignments();
        this.creatures = await this.getCreatures();
        this.weapons = await this.getWeapons();
        this.armors = await this.getArmors();
        this.races = await this.getRaces();
      
    }
}
</script>

<style scoped>
label.radio {
    margin-right: 1rem;
}
</style>